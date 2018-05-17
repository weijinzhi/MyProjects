package com.zstu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zstu.bean.Student;
import com.zstu.canstants.Canstants;
import com.zstu.canstants.Msg;
import com.zstu.service.StudentService;
import com.zstu.utils.PagedResult;

@Controller  
@RequestMapping("/student") 
public class StudentController extends BaseController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	private StudentService studentService;
	
	//登录页面
	   @RequestMapping("/loginHtml")  
       public String loginHtml(){ 
		   
           return "login";   
       }
	   
	   @RequestMapping("/logout")  
       public String logout(){ 
		   
           return "login";   
       }
	
	//登录请求   
	@RequestMapping("/login")	
	private String login(Student student, ModelMap modelMap,HttpSession httpSession,HttpServletRequest request){
		String result = this.studentService.loginStudent(student, httpSession);
		
		System.out.println(result);
		if(result.equals(Canstants.loginSuccess)){
			 return "studentEdit";
		}
		if(result.equals(Canstants.loginEmPawNull)){
			httpSession.setAttribute("message", "账号或密码不能为空");
			return "redirect:/login.jsp";
		}
		if(result.equals(Canstants.loginPawFail)){
			httpSession.setAttribute("message", "账号或密码错误！");
			return "redirect:/login.jsp";
		}
		modelMap.addAttribute("result",result);		
	   return "redirect:/login.jsp";	 
	}
	
	@RequestMapping("/stu-list")
	public String list(){
		return "manager/student-list";
	}
	
	@RequestMapping("/send")
	public String send(){
		return "teacher/student-send";
	}
	
	@RequestMapping(value="/list", method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String list(Integer pageNumber,Integer pageSize ,String studentName) {
		logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", pageNumber,pageSize);
		try {
			PagedResult<Student> pageResult = studentService.queryByPage(studentName, pageNumber,pageSize);
			System.out.println(pageResult.getTotal());
			return responseSuccess(pageResult);
    	} catch (Exception e) {
			return responseFail(e.getMessage());
		}
    }
	
	//=======================================================================
	@RequestMapping("/stu")
	public String getStudent(String id, ModelMap model)
	{
		Student stu = studentService.selectStuByStuId(id);
		model.addAttribute("stu",stu);
		System.out.println(stu.getStudentName());
		return "student/modify";
	}
	//学生更新方法
	@RequestMapping(value="/stu/update",method=RequestMethod.PUT)
	@ResponseBody
	public Msg updateStu(Student student)
	{
		System.out.println(student);
		System.out.println(student.getId() + student.getPassword());
		studentService.updateStu(student);
		return Msg.success();
	}
	//=======================================================================
	
	//学生更新方法
		@RequestMapping("/studentAll")
		@ResponseBody
		public Msg getStudentJson(
				@RequestParam(value = "pn", defaultValue = "1") Integer pn,
				Model model) {
			PageHelper.startPage(pn, 5);
			List<Student> stu = studentService.getAll();

			// 将pageinfo包装查询后的结果，只需要将pageinfo交给页面即可
			PageInfo page = new PageInfo(stu, 5);
			System.out.println(page);
			return Msg.success().add("pageInfo", page);
		}
}

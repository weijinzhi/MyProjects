package com.zstu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zstu.bean.Teacher;
import com.zstu.canstants.Canstants;
import com.zstu.canstants.Msg;
import com.zstu.service.TeacherService;
import com.zstu.utils.PagedResult;

@Controller
@RequestMapping("/teacher")
public class TeacherController extends BaseController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	// private static Logger logger = Logger.getLogger(LoginController.class);
	@Resource
	private TeacherService teacherService;

	// 登录页面
	@RequestMapping("/loginHtml")
	public String loginHtml() {

		return "login";
	}
	
	@RequestMapping("/getById")
	public String getById(String teacherId,ModelMap modelMap) {
		Teacher teacher = teacherService.getById(teacherId);
		System.out.println(teacher);
		modelMap.addAttribute("teacher", teacher);
		return "manager/index";
	}
	
	@RequestMapping("/getRole")
	public String getRole(String teacherId,ModelMap modelMap) {
		Teacher teacher = teacherService.getById(teacherId);
		System.out.println(teacher);
		modelMap.addAttribute("teacher", teacher);
		return "index";
	}

	// 登录请求
	@RequestMapping("/login")
	private String login(Teacher teacher, ModelMap modelMap,
			HttpSession httpSession, HttpServletRequest request) {

		String result = this.teacherService.loginTeacher(teacher, httpSession);

		if (result.equals(Canstants.loginSuccess)) {
			return "managerEdit";
		}
		if (result.equals(Canstants.loginEmPawNull)) {
			httpSession.setAttribute("message", "账号或密码不能为空");
			return "redirect:/login.jsp";
		}
		if (result.equals(Canstants.loginPawFail)) {
			httpSession.setAttribute("message", "账号或密码错误！");
			return "redirect:/login.jsp";
		}
		modelMap.addAttribute("result", result);
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/tea-list")
	public String list(){
		return "manager/teacher-list";
	}
	
	@RequestMapping("/message")
	public String message(){
		return "/teacher/message";
	}
	
	@RequestMapping(value="/list", method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String list(Integer pageNumber,Integer pageSize ,String teacherName) {
		logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", pageNumber,pageSize);
		try {
			PagedResult<Teacher> pageResult = teacherService.queryByPage(teacherName, pageNumber,pageSize);
			System.out.println(pageResult.getTotal());
			return responseSuccess(pageResult);
    	} catch (Exception e) {
			return responseFail(e.getMessage());
		}
    }
	
	@RequestMapping("/toteacherupdate")
	public String topage(){
		return "teacher/information";
	}
	
	/**
	 * 根据id查询教师信息
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/information",method=RequestMethod.GET)
	public Msg getTeacher(@RequestParam("id")Integer id){
		Teacher teacher = teacherService.getTeacherById(id);
		return Msg.success().add("teacher", teacher);
	}
	
	/**
	 * 更新教师信息
	 * @param teacher
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/teacherupdate/{id}",method=RequestMethod.PUT)
	public Msg updateTeacher(Teacher teacher){
		System.out.println("teacher:" + teacher);
		teacherService.update(teacher);
		return Msg.success();
	}

}

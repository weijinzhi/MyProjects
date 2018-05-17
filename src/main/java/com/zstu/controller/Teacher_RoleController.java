package com.zstu.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zstu.bean.Teacher_Role;
import com.zstu.service.Teacher_RoleService;
import com.zstu.utils.PagedResult;

@Controller
@RequestMapping("/tearole")
public class Teacher_RoleController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	Teacher_RoleService teacher_RoleService;
	
	@RequestMapping("/tea-role")
	public String list(){
		return "manager/role-allocation";
	}
	
	@RequestMapping(value="/role", method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String list(Integer pageNumber,Integer pageSize ,String teacherId) {
		logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", pageNumber,pageSize);
		try {
			PagedResult<Teacher_Role> pageResult = teacher_RoleService.queryByPage(teacherId, pageNumber,pageSize);
			return responseSuccess(pageResult);
    	} catch (Exception e) {
			return responseFail(e.getMessage());
		}
    }
	
	@RequestMapping(value="/modify", method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    public String modify(Integer pageNumber,Integer pageSize ,Integer id,String roleName) {
		if(teacher_RoleService.updateTeacher_Role(id, roleName)){  
            return "manager/role-allocation";  
        } 
		return "error/error"; 
    }
}

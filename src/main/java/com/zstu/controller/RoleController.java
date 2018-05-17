package com.zstu.controller;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zstu.bean.Role;
import com.zstu.service.RoleService;
import com.zstu.utils.PagedResult;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private RoleService roleService;

    @RequestMapping("/")  
    public ModelAndView getIndex(){    
		ModelAndView mav = new ModelAndView("index"); 
		Role role = roleService.selectRoleById(1);
	    mav.addObject("role", role); 
        return mav;  
    }
    /**
	 * 显示首页
	 * @author linbingwen
	 * @since  2015年10月23日 
	 * @return
	 */
    @RequestMapping("/role-list")
	public String list(){
		return "manager/role-list";
	}
    
    @RequestMapping("/role-allocation")
	public String allocation(){
		return "role-allocation";
	}
	
    /**
     * 分页查询用户信息
     * @author linbingwen
     * @since  2015年10月23日 
     * @param page
     * @return
     */
    @RequestMapping(value="/list", method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String list(Integer pageNumber,Integer pageSize ,String roleName) {
		logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", pageNumber,pageSize);
		try {
			PagedResult<Role> pageResult = roleService.queryByPage(roleName, pageNumber,pageSize);
			System.out.println(pageResult.getTotal());
			return responseSuccess(pageResult);
    	} catch (Exception e) {
			return responseFail(e.getMessage());
		}
    }


}
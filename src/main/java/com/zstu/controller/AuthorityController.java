package com.zstu.controller;

import java.io.IOException;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zstu.bean.Authority;
import com.zstu.service.AuthorityService;
import com.zstu.utils.PagedResult;

@Controller  
@RequestMapping("/auth")
public class AuthorityController extends BaseController {
//	@Autowired
//	AuthorityService authorityService;
//	/**
//	 * 权限列表
//	 * @param findContent	查询内容
//	 * @param pageNo		页码
//	 * @param modelMap		参数回显
//	 * @return
//	 */
//	@RequestMapping(value="listAuthority")
//	public ModelAndView index(String findContent,ModelMap modelMap,Integer pageNo,Integer pageSize){
//		modelMap.put("findContent", findContent);
//		Pagination<Authority> authority = authorityService.findPage(modelMap, pageNo, pageSize);
//		System.out.println(authority.getPageSize());
//		return new ModelAndView("authority","page",authority);
//	}
//	
//	@ResponseBody
//	@RequestMapping(value="findAuthorityByteacherId")
//	public String index(String teacherId,ModelMap modelMap){
//		List authority = authorityService.findAuthorityByteacherId(teacherId);
//		PageInfo<Object> page = new PageInfo<>(authority,5);
//		System.out.println(page.getPages());  //1
//		System.out.println(page.getTotal());  //7
//		System.out.println(page.getPageNum());  //1
//		modelMap.addAttribute("list", authority);
//		return "authority";
//	}
	
	private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private AuthorityService authorityService;

    @RequestMapping("/")  
    public ModelAndView getIndex(){    
		ModelAndView mav = new ModelAndView("index"); 
		Authority authority = authorityService.selectAuthorityById(1);
	    mav.addObject("authority", authority); 
        return mav;  
    }
    /**
	 * 显示首页
	 * @author linbingwen
	 * @since  2015年10月23日 
	 * @return
	 */
    @RequestMapping("/auth-list")
	public String list(){
		return "manager/authority-list";
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
    public String list(Integer pageNumber,Integer pageSize ,String authorityName) {
		logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", pageNumber,pageSize);
		try {
			PagedResult<Authority> pageResult = authorityService.queryByPage(authorityName, pageNumber,pageSize);
			System.out.println(pageResult.getDataList().get(0).getAuthorityName());
			return responseSuccess(pageResult);
    	} catch (Exception e) {
			return responseFail(e.getMessage());
		}
    }
    
    @RequestMapping("/findAuthorityByteacherId")
	public String listManager(){
    	System.out.println("findAuthorityByteacherId");
		return "manager/managerAuthority";
	}
	
    /**
     * 分页查询用户信息
     * @author linbingwen
     * @since  2015年10月23日 
     * @param page
     * @throws IOException 
     */
    @RequestMapping(value="/manager", method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String manager(Integer pageNumber,Integer pageSize ,String teacherId) {
    	
//    	PrintWriter pw = response.getWriter();  
//        //得到客户端传递的页码和每页记录数，并转换成int类型  
    	
//		List<Authority> auList = authorityService.findAuthorityByteacherId(teacherId);
//		JSONArray au = JSONArray.fromObject(auList);
//		String json = "{\"total\":" + pageResult.getTotal() + ",\"rows\":" + au + "}";  
//		pw.print(json); 
		
    	logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", pageNumber,pageSize);
		try {
			PagedResult<Authority> pageResult = authorityService.queryByPageManager(teacherId, pageNumber,pageSize);
			return responseSuccess(pageResult);
    	} catch (Exception e) {
			return responseFail(e.getMessage());
		}
    }
}

package com.zstu.service;

import java.util.List;

import com.zstu.bean.Role;
import com.zstu.utils.PagedResult;

public interface RoleService {

//	List<Role> findAllRole();
//	
//	List<Role> searchInvList(Page page);
//	
//	Integer searchTotalCount(Page page);
//
//    Integer deleteInvition(Integer id);
//    
//    List<Role> getInvBycondtion(Page page);
	
	Role selectRoleById(Integer id);
	
	List<Role> selectRoleByRoleName(String roleName);
	
	/**
	 * 
	 * @author linbingwen
	 * @since  2015年10月23日 
	 * @param userName 查询条件，可为空
	 * @param pageNo 查询条件，可为空，默认取1
	 * @param pageSize 查询条件，可为空，默认取10
	 * @return
	 */
	PagedResult<Role> queryByPage(String roleName,Integer pageNo,Integer pageSize);
}

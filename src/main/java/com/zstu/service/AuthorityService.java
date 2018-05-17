package com.zstu.service;

import java.util.List;

import com.zstu.bean.Authority;
import com.zstu.utils.PagedResult;

public interface AuthorityService {

	Authority selectAuthorityById(Integer id);
	
	List<Authority> selectAuthorityByName(String authorityName);
	
	List<Authority> findAuthorityByteacherId(String teacherId);
	
	/**
	 * 
	 * @author linbingwen
	 * @since  2015年10月23日 
	 * @param userName 查询条件，可为空
	 * @param pageNo 查询条件，可为空，默认取1
	 * @param pageSize 查询条件，可为空，默认取10
	 * @return
	 */
	PagedResult<Authority> queryByPage(String authorityName,Integer pageNo,Integer pageSize);

	PagedResult<Authority> queryByPageManager(String teacherId,Integer pageNo,Integer pageSize);
}

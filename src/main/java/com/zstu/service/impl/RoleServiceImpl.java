package com.zstu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zstu.bean.Role;
import com.zstu.dao.RoleMapper;
import com.zstu.service.RoleService;
import com.zstu.utils.BeanUtil;
import com.zstu.utils.PagedResult;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
	
//	@Resource
//	RoleMapper roleMapper;
//
//	@Override
//	public List<Role> findAllRole() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Role> searchInvList(Page page) {
//		// TODO Auto-generated method stub
//		return roleMapper.searchInvList(page);
//	}
//
//	@Override
//	public Integer searchTotalCount(Page page) {
//		// TODO Auto-generated method stub
//		return roleMapper.searchTotalCount(page);
//	}
//
//	@Override
//	public Integer deleteInvition(Integer id) {
//		// TODO Auto-generated method stub
//		return roleMapper.deleteInvition(id);
//	}
//
//	@Override
//	public List<Role> getInvBycondtion(Page page) {
//		// TODO Auto-generated method stub
//		return roleMapper.getInvBycondtion(page);
//	}
	
	@Resource
	private RoleMapper roleMapper;

	@Override
	public PagedResult<Role> queryByPage(String roleName,Integer pageNo,Integer pageSize ) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(roleMapper.selectRoleByRoleName(roleName));
	}

	@Override
	public Role selectRoleById(Integer id) {
		return roleMapper.selectRoleById(id);
	}

	@Override
	public List<Role> selectRoleByRoleName(String roleName) {
		List<Role> list = roleMapper.selectRoleByRoleName(roleName);
		return list;
	}

}

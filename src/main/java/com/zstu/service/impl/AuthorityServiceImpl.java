package com.zstu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zstu.bean.Authority;
import com.zstu.dao.AuthorityMapper;
import com.zstu.page.BaseMybatisDao;
import com.zstu.service.AuthorityService;
import com.zstu.utils.BeanUtil;
import com.zstu.utils.PagedResult;

@Service("authorityService")
public class AuthorityServiceImpl extends BaseMybatisDao<Authority> implements AuthorityService {
	
	@Resource
	private AuthorityMapper authorityMapper;

	@Override
	public PagedResult<Authority> queryByPage(String authorityName,Integer pageNo,Integer pageSize ) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(authorityMapper.selectAuthorityByName(authorityName));
	}

	@Override
	public Authority selectAuthorityById(Integer id) {
		return authorityMapper.selectAuthorityById(id);
	}

	@Override
	public List<Authority> selectAuthorityByName(String authorityName) {
		List<Authority> list = authorityMapper.selectAuthorityByName(authorityName);
		return list;
	}

	@Override
	public List<Authority> findAuthorityByteacherId(String teacherId) {
		List<Authority> list = authorityMapper.findAuthorityByteacherId(teacherId);
		return list;
	}
	
	@Override
	public PagedResult<Authority> queryByPageManager(String teacherId,Integer pageNo,Integer pageSize ) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(authorityMapper.findAuthorityByteacherId(teacherId));
	}

}

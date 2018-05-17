package com.zstu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zstu.bean.Teacher_Role;
import com.zstu.dao.Teacher_RoleMapper;
import com.zstu.service.Teacher_RoleService;
import com.zstu.utils.BeanUtil;
import com.zstu.utils.PagedResult;

@Service("teacher_Role")
public class Teacher_RoleServiceImpl implements Teacher_RoleService {
	
	@Resource
	Teacher_RoleMapper teacher_RoleMapper;

	@Override
	public PagedResult<Teacher_Role> queryByPage(String teacherId,
			Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		System.out.println(teacher_RoleMapper.listRole(teacherId));
		return BeanUtil.toPagedResult(teacher_RoleMapper.listRole(teacherId));
	}

	@Override
	public List<Teacher_Role> selectTeaRoleById(String teacherId) {
		List<Teacher_Role> list = teacher_RoleMapper.listRole(teacherId);
		return list;
	}

	@Override
	public boolean updateTeacher_Role(Integer id, String roleName) {
		return teacher_RoleMapper.updateTeacher_Role(id, roleName);
	}

}

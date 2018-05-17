package com.zstu.service;

import java.util.List;

import com.zstu.bean.Teacher_Role;
import com.zstu.utils.PagedResult;

public interface Teacher_RoleService {
	
	List<Teacher_Role> selectTeaRoleById(String teacherId);

	PagedResult<Teacher_Role> queryByPage(String teacherId,Integer pageNo,Integer pageSize);
	
	boolean updateTeacher_Role(Integer id,String roleName);
}

package com.zstu.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.zstu.bean.Teacher;
import com.zstu.utils.PagedResult;

public interface TeacherService {

	public String registerTeacher(Teacher teacher);
	
	public String loginTeacher(Teacher teacher,HttpSession httpSession);

	public boolean activatEmail(Teacher teacher);
	
	public Teacher getById(String teacherId);
	
	Teacher selectTeacherById(Integer id);
	
	Teacher selectTeacherByTeaId(String teacherId);
	
	List<Teacher> selectTeacherByName(String teacherName);
	
	/**
	 * 
	 * @author linbingwen
	 * @since  2015年10月23日 
	 * @param userName 查询条件，可为空
	 * @param pageNo 查询条件，可为空，默认取1
	 * @param pageSize 查询条件，可为空，默认取10
	 * @return
	 */
	PagedResult<Teacher> queryByPage(String teacherName,Integer pageNo,Integer pageSize);
	
	PagedResult<Teacher> queryByTeaId(String teacherId,Integer pageNo,Integer pageSize);
	
	PagedResult<Teacher> queryByAcademy(String academy,Integer pageNo,Integer pageSize);

	public void update(Teacher teacher);

	public Teacher getTeacherById(Integer id);
}

package com.zstu.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.zstu.bean.Student;
import com.zstu.utils.PagedResult;

public interface StudentService {

	public String registerStudent(Student student);
	
	public String loginStudent(Student student,HttpSession httpSession);

	public boolean activatEmail(Student student);
	
	Student selectStudentById(Integer id);
	
	List<Student> selectStudentByName(String studentName);
	
	/**
	 * 
	 * @author linbingwen
	 * @since  2015年10月23日 
	 * @param userName 查询条件，可为空
	 * @param pageNo 查询条件，可为空，默认取1
	 * @param pageSize 查询条件，可为空，默认取10
	 * @return
	 */
	PagedResult<Student> queryByPage(String studentName,Integer pageNo,Integer pageSize);
	
	PagedResult<Student> queryByStuId(String studentId,Integer pageNo,Integer pageSize);
	
	PagedResult<Student> queryByClassNum(String classNum,Integer pageNo,Integer pageSize);
	
	PagedResult<Student> queryByAcademy(String academy,Integer pageNo,Integer pageSize);
	
	//================================================================
	public Student selectStuByStuId(String studentId);

	public void updateStu(Student student);
	//==================================================================

	public List<Student> getAll();
}

package com.zstu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zstu.bean.Student;
import com.zstu.bean.StudentExample;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    Student login(Student student);
    
    Student selectStudentById(Integer id);
	
	List<Student> selectStudentByName(@Param("studentName") String studentName);
	
	List<Student> selectStudentByStuId(@Param("studentId") String studentId);
	
	List<Student> selectStudentByClassNum(@Param("classNum") String classNum);
	
	List<Student> selectStudentByAcademy(@Param("academy") String academy);
	
	//================查找======================================
	Student selectStuByStuId(String studentId);
	//==========================================================
}
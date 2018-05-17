package com.zstu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zstu.bean.Teacher;
import com.zstu.bean.TeacherExample;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    Teacher login(Teacher teacher);
    
    Teacher getById(String teacherId);
    
    Teacher selectTeacherById(Integer id);
	
	List<Teacher> selectTeacherByName(@Param("teacherName") String teacherName);
	
	List<Teacher> selectTeacherByTeaId(@Param("teacherId") String teacherId);
	
	List<Teacher> selectTeacherByAcademy(@Param("academy") String academy);
	
}
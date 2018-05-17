package com.zstu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zstu.bean.Course_Student;
import com.zstu.dao.Course_StudentMapper;
import com.zstu.service.Course_StudentService;

@Service
public class Course_StudentServiceImpl implements Course_StudentService{
	
	@Autowired
	Course_StudentMapper course_StudentMapper;
	
	public List<Course_Student> getCourseStu(String id)
	{
		
		return course_StudentMapper.selectByPrimaryKeyWithCourse(id);
	}
}

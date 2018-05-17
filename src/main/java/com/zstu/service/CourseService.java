package com.zstu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zstu.bean.Courses;
import com.zstu.dao.CoursesMapper;

@Service
public class CourseService {
	
	@Autowired
	CoursesMapper coursesMapper;

	public void saveCourse(Courses course) {
		coursesMapper.insertSelective(course);
		
	}
	
	public List<Courses> getAll() {
		return coursesMapper.selectByExample(null);
	}
	
	
	
}

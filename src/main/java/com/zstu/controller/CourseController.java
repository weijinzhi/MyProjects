package com.zstu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zstu.bean.Courses;
import com.zstu.canstants.Msg;
import com.zstu.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/save")
	public String save(){
		return "teacher/savecourse";
	}
	
	/**
	 * 新增课程信息
	 * @param course
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/savecourse",method=RequestMethod.POST)
	public Msg saveCourse(Courses course){
		
		courseService.saveCourse(course);
		return Msg.success();
	}
	
	/**
	 * 获取所有课程信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("allcourses")
	public Msg getAllCourse(){
		List<Courses> course = courseService.getAll();
		return Msg.success().add("courses", course);
	}
	
}

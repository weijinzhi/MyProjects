package com.zstu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zstu.bean.Course_Student;
import com.zstu.service.Course_StudentService;

/**
 * 处理查看学生实验课程安排
 * 
 */


@Controller
public class Course_StudentController {
	
	@Autowired
     Course_StudentService course_studentService;
	/**
	 * 查询实验课程安排数据（分页）
	 * 
	 */
	Course_Student course_Student ;
	@RequestMapping("/course-stu")
	public String getCourseStu(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model,String id)
	{
		
		PageHelper.startPage(pn, 5);
		List<Course_Student> courseStu = course_studentService.getCourseStu(id);
		
		//将pageinfo包装查询后的结果，只需要将pageinfo交给页面即可
		PageInfo page = new PageInfo(courseStu,5);
		System.out.println(page);
		model.addAttribute("pageInfo", page);
		List<Course_Student> list =page.getList();
		for(Course_Student course_Student:list){
			System.out.println("ID:"+course_Student.getId()+"==>CourseId:"+course_Student.getCourseId()+"==>CourseName:"+course_Student.getCourses().getCourseName());
		}
		return "student/student_course";
	}
}

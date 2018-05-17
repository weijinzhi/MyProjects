package com.zstu.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.zstu.bean.Student;
import com.zstu.dao.StudentMapper;


//使用Spring测试模块提供的测试请求功能，测试crud请求的正确性

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml",
		"classpath:dispatcherServlet-servlet.xml" })
public class MvcTest {

	@Resource
	// StudentService studentService;
	//Course_StudentService course_StudentService;
     StudentMapper studentMapper;
	
	// 传入Springmvc的ioc
	@Autowired
	WebApplicationContext context;
	// 虚拟mvc请求，获取到处理结果
	MockMvc mockMvc;

	@Before
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	// @Test
	// public void testGetStu() throws Exception{
	// //模拟请求拿到返回值
	// MvcResult result =
	// mockMvc.perform(MockMvcRequestBuilders.get("/course-stu").param("studentId",
	// "01")).andReturn();
	//
	// System.out.println("输出返回值："+result.toString());
	// }

	@Test
	public void testPage() throws Exception {
		MvcResult result = mockMvc.perform(
				MockMvcRequestBuilders.get("/student/studentAll").param("pn","1"))
				.andReturn();
		System.out.println("ssssss");
		MockHttpServletRequest request = result.getRequest();
		PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
		System.out.println("当前页码："+pi.getPageNum());
		System.out.println("总页码："+pi.getPages());
		System.out.println("总记录数"+pi.getTotal());
		System.out.println("在页面需要连续显示的页码");
		int [] nums = pi.getNavigatepageNums();
		for(int i:nums)
		{
			System.out.println(" "+i);
		}
//		//获取学生实验安排
//		List<Course_Student> list = pi.getList();
//		for(Course_Student course_Student:list){
//			System.out.println("ID:"+course_Student.getId()+"==>CourseId:"+course_Student.getCourseId()+"==>CourseName:"+course_Student.getCourses().getCourseName());
//		}
		//获取推送消息
		List<Student> list = pi.getList();
		for(Student student:list){
			System.out.println("ID:"+student.getId()+"==>getAcademy:"+student.getAcademy()+"==>getClassnum:"+student.getClassnum());
		}
		
	}
	// @Test
	// public void test(){
	// System.out.println(studentService.selectStuByStuId("bbb290").getStudentName());
	// }
}

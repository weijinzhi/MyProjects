package com.zstu.test;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zstu.bean.Teacher;
import com.zstu.dao.TeacherMapper;
import com.zstu.dao.Teacher_RoleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TeacherTest {

//	@Autowired
//	TeacherMapper teacherMapper;
	
	@Resource
	Teacher_RoleMapper teacher_RoleMapper;
	
	@org.junit.Test
	public void test(){
//		Teacher teacher = null;
//		System.out.println(teacherMapper.login(teacher));
	}
	
	@org.junit.Test
	public void test1(){
		System.out.println(teacher_RoleMapper.listRole(null));
	}
}

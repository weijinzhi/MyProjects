package com.zstu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zstu.service.StudentService;

@Controller  
public class StudentC {

	@Resource
	StudentService studentService;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public String list(@PathVariable("pn")Integer pn){
		System.out.println("111");
		return "ok";
	}
}

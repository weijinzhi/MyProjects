package com.zstu.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zstu.bean.Messages;
import com.zstu.bean.Teacher;
import com.zstu.service.MessageService;
import com.zstu.service.TeacherService;

@Controller  
@RequestMapping("/message")
public class MessageController extends BaseController {
	private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    MessageService messageService;
    
    @Resource
    TeacherService teacherService;
    
    @RequestMapping("/add")
    public String add(String teacherId,String messTitle,String messContent,ModelMap modelMap) {
    	Teacher tea = teacherService.selectTeacherByTeaId(teacherId);
    	Integer t = tea.getId();
		Messages mess = new Messages(messTitle, messContent, "新闻公告", t, new Date());
    	messageService.add(mess);
		return "teacher/message";
	} 
}

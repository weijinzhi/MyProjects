package com.zstu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zstu.bean.Messages;
import com.zstu.canstants.Msg;
import com.zstu.service.MessagesService;

@Controller
public class Massage_StudentController {
	@Autowired
	MessagesService messagesService;
	
	@RequestMapping("/message-stu")
	public String getMessage(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		
		
		PageHelper.startPage(pn, 5);
		 List<Messages> mes = messagesService.getAll();
		 
		//将pageinfo包装查询后的结果，只需要将pageinfo交给页面即可
		PageInfo page = new PageInfo(mes,5);
		model.addAttribute("pageInfo", page);
		return "student/checkMessage";
	}
	
	@RequestMapping(value="/massage-stu/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getMes(@PathVariable("id")Integer id)
	{
		Messages messages=messagesService.getMes(id);
		return Msg.success().add("mes", messages);
	}

}

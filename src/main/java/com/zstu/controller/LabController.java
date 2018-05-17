package com.zstu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zstu.bean.Lab;
import com.zstu.canstants.Msg;
import com.zstu.service.LabService;


@Controller
public class LabController {
	
	@Autowired
	LabService labService;
	
	@RequestMapping(value="/tosavelab")
	public String saveLab1(Lab lab){
		return "teacher/savelab";
	}
	
	@ResponseBody
	@RequestMapping(value="/savelab",method=RequestMethod.POST)
	public Msg saveLab(Lab lab){
		labService.saveLab(lab);
		return Msg.success();
	}
	
	@ResponseBody
	@RequestMapping("/labs")
	public Msg getLabs(){
		List<Lab> labs = labService.getAll();
		return Msg.success().add("labs", labs);
	}
}

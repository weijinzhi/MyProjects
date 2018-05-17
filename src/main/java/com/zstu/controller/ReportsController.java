package com.zstu.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zstu.bean.Reports;
import com.zstu.bean.Stu_Submit_To_Teacher;
import com.zstu.canstants.Msg;
import com.zstu.service.ReportsService;

@Controller
public class ReportsController {

	@Autowired
	ReportsService reportsService;
	
	@RequestMapping("/list")
	public String list(){
		return "student/report-list";
	}

	@RequestMapping("/reportload")
	@ResponseBody
	public Msg getReportsWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model) {
		PageHelper.startPage(pn, 5);
		List<Reports> rep = reportsService.getAll();

		// 将pageinfo包装查询后的结果，只需要将pageinfo交给页面即可
		PageInfo page = new PageInfo(rep, 5);
		System.out.println(page);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping("/toallreports")
	public String all(){
		return "teacher/allsubmitreports";
	}
	
	@ResponseBody
	@RequestMapping("/allsubmitreports")
	public Msg getAll(){
		List<Stu_Submit_To_Teacher> reports = reportsService.getAllSubmitStudent();
		return Msg.success().add("submitreports", reports);
	}
	
	@ResponseBody
	@RequestMapping(value="/download",method=RequestMethod.GET)
	public Msg down(@RequestParam("filename")String filename,HttpServletRequest request, HttpServletResponse response) throws Exception{
		response.setContentType("application/x-msdownload");
		String filePath = "G:\\files\\";
		String realpath = filePath+filename;
		System.out.println(realpath);
		
		response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
		
		OutputStream out = response.getOutputStream();
		
		InputStream in = new FileInputStream(realpath);
		
		byte [] buffer = new byte[1024];
		int len = 0;
		while((len = in.read(buffer)) != -1){
			out.write(buffer, 0, len);
		}
		in.close();
		
		return Msg.success();
	}
}

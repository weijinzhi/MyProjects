package com.zstu.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zstu.bean.Material;
import com.zstu.canstants.Msg;
import com.zstu.service.MaterialService;

@Controller
public class MaterialController {
	
	@Autowired
	MaterialService materialService;
	
	
	@RequestMapping("toupoadmaterial")
	public String to_upload_page(){
		return "teacher/uploadmaterialpage";
	}
	
	/**
	 * 文件上传
	 * @param multipartFile
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public Msg upload(@RequestParam(value="file",required=false)MultipartFile multipartFile) throws IllegalStateException, IOException{
		if (multipartFile.isEmpty()){
            return Msg.fail();
        }
		String fileName = multipartFile.getOriginalFilename();
		System.out.println(fileName);
		String filePath = "G:\\files\\";
		String realpath = filePath+fileName;
		File getFile = new File(realpath);
		if (getFile.getParentFile().exists()){
			multipartFile.transferTo(getFile);     //把内存文件写到磁盘里
        }
		Material material = new Material();
		material.setCreateTime(new Date());
		material.setTeacherId(1);
		material.setMaterialFileName(fileName);
		material.setMaterialFilePath(filePath);
		materialService.saveMaterial(material);
		
		return Msg.success();
	}
	
}

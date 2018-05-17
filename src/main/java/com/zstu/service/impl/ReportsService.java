package com.zstu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zstu.bean.Stu_Submit_To_Teacher;
import com.zstu.dao.ReportsMapper;
import com.zstu.dao.Stu_Submit_To_TeacherMapper;
import com.zstu.dao.StudentMapper;

@Service
public class ReportsService {
	
	@Autowired
	ReportsMapper reportsMapper;
	
	@Autowired
	Stu_Submit_To_TeacherMapper to_TeacherMapper;
	
	@Autowired
	StudentMapper studentMapper;
	
	public List<Stu_Submit_To_Teacher> getAllSubmitStudent() {
		
		List<Stu_Submit_To_Teacher> list =  to_TeacherMapper.selectByExample(null);
		for(Stu_Submit_To_Teacher repo : list){
			repo.setStudent(studentMapper.selectByPrimaryKey(repo.getStudentId()));
		}
		
		return list;
	}
	
	
	
}

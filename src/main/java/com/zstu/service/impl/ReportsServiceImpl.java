package com.zstu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zstu.bean.Reports;
import com.zstu.bean.Stu_Submit_To_Teacher;
import com.zstu.dao.ReportsMapper;
import com.zstu.service.ReportsService;

@Service
public class ReportsServiceImpl implements ReportsService{
	
	@Autowired
	ReportsMapper reportsMapper;
	public List<Reports> getAll()
	{
		return	reportsMapper.selectByExampleWithTeacher(null); 
	
	}
	@Override
	public List<Stu_Submit_To_Teacher> getAllSubmitStudent() {
		// TODO Auto-generated method stub
		return null;
	};

}

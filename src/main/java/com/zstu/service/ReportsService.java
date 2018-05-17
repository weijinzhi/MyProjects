package com.zstu.service;

import java.util.List;

import com.zstu.bean.Reports;
import com.zstu.bean.Stu_Submit_To_Teacher;

public interface ReportsService {

	List<Reports> getAll();

	List<Stu_Submit_To_Teacher> getAllSubmitStudent();
	
	}
package com.zstu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zstu.bean.Lab;
import com.zstu.dao.LabMapper;


@Service
public class LabService {
	
	@Autowired
	LabMapper labMapper;

	public void saveLab(Lab lab) {
		labMapper.insertSelective(lab);
		
	}

	public List<Lab> getAll() {
		return labMapper.selectByExample(null);
	}
	
}

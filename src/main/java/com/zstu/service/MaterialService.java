package com.zstu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zstu.bean.Material;
import com.zstu.dao.MaterialMapper;

@Service
public class MaterialService {
	
	@Autowired
	MaterialMapper materialMapper;

	public void saveMaterial(Material material) {
		materialMapper.insertSelective(material);
		
	}
	
	
}

package com.zstu.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zstu.bean.Messages;
import com.zstu.dao.MessagesMapper;
import com.zstu.service.MessagesService;

@Service
public class MessagesServiceImpl implements MessagesService{
	
	@Autowired
	MessagesMapper messagesMapper;
	
	public List<Messages> getAll(){
		return messagesMapper.selectByExampleWithTeacher(null);
	};
	public Messages getMes(Integer id)
	{
		Messages message = messagesMapper.selectByPrimaryKey(id);
		return message;
	};
}

package com.zstu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zstu.bean.Messages;
import com.zstu.dao.MessagesMapper;
import com.zstu.service.MessageService;

@Service("message")
public class MessageServiceImpl implements MessageService {
	
	@Resource
	MessagesMapper messagesMapper;

	@Override
	public boolean add(Messages message) {
		return messagesMapper.insert(message);
	}

}

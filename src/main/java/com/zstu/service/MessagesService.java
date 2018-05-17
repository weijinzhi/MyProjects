package com.zstu.service;

import java.util.List;

import com.zstu.bean.Messages;




public interface MessagesService {

	public List<Messages> getAll();

	public Messages getMes(Integer id);

	

}

package com.zstu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zstu.bean.Messages;
import com.zstu.bean.MessagesExample;

public interface MessagesMapper {
    long countByExample(MessagesExample example);

    int deleteByExample(MessagesExample example);

    int deleteByPrimaryKey(Integer id);

    boolean insert(Messages record);

    int insertSelective(Messages record);

    List<Messages> selectByExample(MessagesExample example);

    Messages selectByPrimaryKey(Integer id);
    
    List<Messages> selectByExampleWithTeacher(MessagesExample example);

    Messages selectByPrimaryKeyWithTeacher(Integer id);
    
    int updateByExampleSelective(@Param("record") Messages record, @Param("example") MessagesExample example);

    int updateByExample(@Param("record") Messages record, @Param("example") MessagesExample example);

    int updateByPrimaryKeySelective(Messages record);

    int updateByPrimaryKey(Messages record);
}
package com.zstu.dao;

import com.zstu.bean.Messs_Send_To_Stu;
import com.zstu.bean.Messs_Send_To_StuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Messs_Send_To_StuMapper {
    long countByExample(Messs_Send_To_StuExample example);

    int deleteByExample(Messs_Send_To_StuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Messs_Send_To_Stu record);

    int insertSelective(Messs_Send_To_Stu record);

    List<Messs_Send_To_Stu> selectByExample(Messs_Send_To_StuExample example);

    Messs_Send_To_Stu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Messs_Send_To_Stu record, @Param("example") Messs_Send_To_StuExample example);

    int updateByExample(@Param("record") Messs_Send_To_Stu record, @Param("example") Messs_Send_To_StuExample example);

    int updateByPrimaryKeySelective(Messs_Send_To_Stu record);

    int updateByPrimaryKey(Messs_Send_To_Stu record);
}
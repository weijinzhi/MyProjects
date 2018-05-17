package com.zstu.dao;

import com.zstu.bean.Lab;
import com.zstu.bean.LabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabMapper {
    long countByExample(LabExample example);

    int deleteByExample(LabExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lab record);

    int insertSelective(Lab record);

    List<Lab> selectByExample(LabExample example);

    Lab selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lab record, @Param("example") LabExample example);

    int updateByExample(@Param("record") Lab record, @Param("example") LabExample example);

    int updateByPrimaryKeySelective(Lab record);

    int updateByPrimaryKey(Lab record);
}
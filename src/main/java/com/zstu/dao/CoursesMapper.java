package com.zstu.dao;

import com.zstu.bean.Courses;
import com.zstu.bean.CoursesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursesMapper {
    long countByExample(CoursesExample example);

    int deleteByExample(CoursesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Courses record);

    int insertSelective(Courses record);

    List<Courses> selectByExample(CoursesExample example);

    Courses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Courses record, @Param("example") CoursesExample example);

    int updateByExample(@Param("record") Courses record, @Param("example") CoursesExample example);

    int updateByPrimaryKeySelective(Courses record);

    int updateByPrimaryKey(Courses record);
}
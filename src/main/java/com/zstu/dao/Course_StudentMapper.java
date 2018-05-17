package com.zstu.dao;

import com.zstu.bean.Course_Student;
import com.zstu.bean.Course_StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Course_StudentMapper {
    long countByExample(Course_StudentExample example);

    int deleteByExample(Course_StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Course_Student record);

    int insertSelective(Course_Student record);

    List<Course_Student> selectByExample(Course_StudentExample example);

    Course_Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Course_Student record, @Param("example") Course_StudentExample example);

    int updateByExample(@Param("record") Course_Student record, @Param("example") Course_StudentExample example);

    int updateByPrimaryKeySelective(Course_Student record);

    int updateByPrimaryKey(Course_Student record);
    
    //===========================================================
    List<Course_Student> selectByExampleWithCourse(Course_StudentExample example);

    List<Course_Student> selectByPrimaryKeyWithCourse(String id);
    //============================================================
}
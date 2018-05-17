package com.zstu.dao;

import com.zstu.bean.Stu_Submit_To_Teacher;
import com.zstu.bean.Stu_Submit_To_TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stu_Submit_To_TeacherMapper {
    long countByExample(Stu_Submit_To_TeacherExample example);

    int deleteByExample(Stu_Submit_To_TeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Stu_Submit_To_Teacher record);

    int insertSelective(Stu_Submit_To_Teacher record);

    List<Stu_Submit_To_Teacher> selectByExample(Stu_Submit_To_TeacherExample example);

    Stu_Submit_To_Teacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Stu_Submit_To_Teacher record, @Param("example") Stu_Submit_To_TeacherExample example);

    int updateByExample(@Param("record") Stu_Submit_To_Teacher record, @Param("example") Stu_Submit_To_TeacherExample example);

    int updateByPrimaryKeySelective(Stu_Submit_To_Teacher record);

    int updateByPrimaryKey(Stu_Submit_To_Teacher record);
}
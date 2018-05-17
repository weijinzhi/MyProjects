package com.zstu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zstu.bean.Teacher_Role;
import com.zstu.bean.Teacher_RoleExample;

public interface Teacher_RoleMapper {
    long countByExample(Teacher_RoleExample example);

    int deleteByExample(Teacher_RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher_Role record);

    int insertSelective(Teacher_Role record);

    List<Teacher_Role> selectByExample(Teacher_RoleExample example);

    Teacher_Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teacher_Role record, @Param("example") Teacher_RoleExample example);

    int updateByExample(@Param("record") Teacher_Role record, @Param("example") Teacher_RoleExample example);

    int updateByPrimaryKeySelective(Teacher_Role record);

    int updateByPrimaryKey(Teacher_Role record);
    
    List<Teacher_Role> listRole(String teacherId);
    
//    List<Teacher_Role> listRole(@Param("teacherId") String teacherId);
    boolean updateTeacher_Role(@Param("id")Integer id,@Param("roleName")String roleName);
}
package com.zstu.dao;

import com.zstu.bean.Authority_Role;
import com.zstu.bean.Authority_RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Authority_RoleMapper {
    long countByExample(Authority_RoleExample example);

    int deleteByExample(Authority_RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Authority_Role record);

    int insertSelective(Authority_Role record);

    List<Authority_Role> selectByExample(Authority_RoleExample example);

    Authority_Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Authority_Role record, @Param("example") Authority_RoleExample example);

    int updateByExample(@Param("record") Authority_Role record, @Param("example") Authority_RoleExample example);

    int updateByPrimaryKeySelective(Authority_Role record);

    int updateByPrimaryKey(Authority_Role record);
}
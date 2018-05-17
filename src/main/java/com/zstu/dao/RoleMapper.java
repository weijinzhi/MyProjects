package com.zstu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zstu.bean.Role;
import com.zstu.bean.RoleExample;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    List<Role> findAllRole(Map<String, Object> map);
    
//    public List<Role>  searchInvList(Page page);//查询帖子列表
//    
//    public List<Role> getInvBycondtion(Page page);//根据条件查询帖子
//    
//    public Integer searchTotalCount(Page page);//搜索总数量
//    
//    public Integer deleteInvition(Integer id);//根据id删除帖子
    
	 Role selectRoleById(Integer id);
	
	 List<Role> selectRoleByRoleName(@Param("roleName") String roleName);
}
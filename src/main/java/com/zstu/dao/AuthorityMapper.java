package com.zstu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zstu.bean.Authority;

public interface AuthorityMapper {
	Authority selectAuthorityById(Integer id);
	
	List<Authority> selectAuthorityByName(@Param("authorityName") String authorityName);
	
	List<Authority> findAuthorityByteacherId(String teacherId);
}
package com.bec.security.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.security.demo.model.AuthUser;

@Mapper
public interface AuthUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    AuthUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);

	List<AuthUser> selectAuthUser(AuthUser authUser);

	AuthUser selectAuthUserByUsername(String username);
}
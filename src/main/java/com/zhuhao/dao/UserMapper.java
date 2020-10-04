package com.zhuhao.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zhuhao.bean.User;

@Mapper
public interface UserMapper {
	public User checkUser(Map<String, Object> map);
}

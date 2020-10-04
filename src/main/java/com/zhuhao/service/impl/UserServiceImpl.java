package com.zhuhao.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuhao.bean.User;
import com.zhuhao.dao.UserMapper;
import com.zhuhao.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User checkUser(Map<String, Object> map) {
		return userMapper.checkUser(map);
	}

}

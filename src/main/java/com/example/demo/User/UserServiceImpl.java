package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public String getUserNameById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void InsertUser(User userDTO) {
		userMapper.InsertUser(userDTO);
	}

	@Override
	public User Login(String userID, String password) {
		return userMapper.Login(userID, password);
	}



}
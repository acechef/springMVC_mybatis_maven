package com.zhujq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhujq.dao.UserDao;
import com.zhujq.entity.User;
import com.zhujq.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserDao userDao;
	
	public Integer insertUser(User user){
		return userDao.insertUser(user);
	}
	
	public User queryUserById(Integer id){
		return userDao.queryUserById(id);
	}
	
	public List<User> queryAllUser(){
		return userDao.queryAllUser();
	}
}

package com.zhujq.service;

import java.util.List;

import com.zhujq.entity.User;

public interface UserService {
	
	public Integer insertUser(User user);
	
	public User queryUserById(Integer id);
	
	public List<User> queryAllUser();
}

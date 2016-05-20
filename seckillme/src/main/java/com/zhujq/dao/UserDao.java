package com.zhujq.dao;

import java.util.List;

import com.zhujq.entity.User;

public interface UserDao {
	
	public Integer insertUser(User user);
	
	public User queryUserById(Integer id);
	
	public List<User> queryAllUser();
}

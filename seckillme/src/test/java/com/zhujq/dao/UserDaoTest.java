package com.zhujq.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhujq.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {
	@Resource
	private UserDao userDao;
	
	/**
	 * 添加用户
	 * @throws Exception
	 */
	@Test
	public void testInsertUser() throws Exception{
		User user = new User();
		user.setName("Maria");
		user.setAge(15);
		Integer i = userDao.insertUser(user);
		System.err.println(i);
	}
	
	/**
	 * 根据id查找用户
	 * @throws Exception
	 */
	@Test
	public void queryUserById() throws Exception{
		User user = userDao.queryUserById(1);
		System.err.println(user);
	}
	
	/**
	 * 取出全部用户
	 * @throws Exception
	 */
	@Test
	public void queryAllUser() throws Exception{
		List<User> list = userDao.queryAllUser();
		System.err.println(list);
	}
}

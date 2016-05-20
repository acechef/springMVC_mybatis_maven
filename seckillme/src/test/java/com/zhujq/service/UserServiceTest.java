package com.zhujq.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhujq.entity.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class UserServiceTest {
	@Autowired
    private UserService userService;
	
	@Test
    public void testGetById() throws Exception {
        User user = userService.queryUserById(2);
        System.out.println(user);
    }
}

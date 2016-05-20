package com.zhujq.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhujq.entity.UserAddress;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserAddressDaoTest {
	@Resource
	private UserAddressDao userAddressDao;
	
//	@Test
//	public void testInsertUserAddress() throws Exception{
//		UserAddress userAddress = new UserAddress();
//		userAddress.setPersonId(1);
//		userAddress.setAddress("杭州萧山");
//		Integer i = userAddressDao.insertUserAddress(userAddress);
//		System.err.println(i);
//	}
	
	@Test
	public void testUpdateUserAddress() throws Exception{
		Integer id =5;
		String address = "sdasd";
		Integer i = userAddressDao.updateAddress(id,address);
		System.err.println(i);
	}
}

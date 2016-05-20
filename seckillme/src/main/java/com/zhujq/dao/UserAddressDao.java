package com.zhujq.dao;

import org.apache.ibatis.annotations.Param;

import com.zhujq.entity.UserAddress;

public interface UserAddressDao {
	
	public Integer insertUserAddress(UserAddress userAddress);
	
	public Integer updateAddress(@Param("id")Integer id,@Param("address")String address);
}

package com.zhujq.entity;

public class UserAddress {
	private Integer id;
	private Integer personId;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserAddress [id=" + id + ", personId=" + personId
				+ ", address=" + address + "]";
	}
}

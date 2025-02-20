package com.rest.entity;

public class UserEntity {
	private Integer id;
	private String name;
	private Long mobile;
	private String address;

	public UserEntity() {
	}

	public UserEntity(Integer id, String name, Long mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

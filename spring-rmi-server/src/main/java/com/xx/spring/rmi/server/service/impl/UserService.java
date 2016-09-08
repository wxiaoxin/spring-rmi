package com.xx.spring.rmi.server.service.impl;

import com.xx.spring.rmi.server.model.User;
import com.xx.spring.rmi.server.service.IUserService;

public class UserService implements IUserService {

	public UserService() {
		super();
	}

	public User getUser() {
		User user = new com.xx.spring.rmi.server.model.User();
		user.setName("admin");
		user.setPassword("123456");
		return user;
	}

}

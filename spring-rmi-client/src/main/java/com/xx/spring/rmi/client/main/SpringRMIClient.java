package com.xx.spring.rmi.client.main;

import java.rmi.RemoteException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xx.spring.rmi.server.service.IUserService;

public class SpringRMIClient {

	public static void main(String[] args) throws RemoteException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		context.start();
		IUserService userService = context.getBean("userService", IUserService.class);
		
		System.err.println("远程调用的结果是：" + userService.getUser().getName() + "  " + userService.getUser().getPassword());
		
	}
	
}

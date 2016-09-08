package com.xx.spring.rmi.server.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRMIServer {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		context.start();
		
		System.err.println("Server端的IUserService已经启动，等待远程调用..");
		System.in.read();
		
	}
	
}

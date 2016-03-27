package com.yulartech.helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld{

	public void printHelloWorld(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Hello : "+msg);
	}

}

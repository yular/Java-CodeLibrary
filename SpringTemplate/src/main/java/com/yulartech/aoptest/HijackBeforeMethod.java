package com.yulartech.aoptest;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/*
 * Not working
 */
public class HijackBeforeMethod implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("HijackBeforeMethod : Before method hijacked!");
	}

}

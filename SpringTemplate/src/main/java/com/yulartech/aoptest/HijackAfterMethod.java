package com.yulartech.aoptest;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/*
 * Not working
 */
public class HijackAfterMethod implements AfterReturningAdvice{

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		 System.out.println("HijackAfterMethod : After method hijacked!");
	}

}

package com.yulartech.aoptest;

import org.springframework.aop.ThrowsAdvice;

/*
 * Not working
 */
public class HijackThrowException implements ThrowsAdvice{
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}

}

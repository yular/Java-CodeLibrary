package com.yulartech.templateDomain;

import org.springframework.stereotype.Service;

//@Named
@Service
public class UserBoImpl implements UserBo {

	public void printUser() {
		// TODO Auto-generated method stub
		System.out.println("printUser() is executed...");
	}
	
	public String getMessage() {	
		return "JSF 2 + Spring Integration";
	}

}

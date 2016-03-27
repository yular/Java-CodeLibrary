package com.yulartech.templateService;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class CustomerService implements InitializingBean, DisposableBean{

	String message;
	String name;
	String url;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setUrl(String url){
		this.url = url;
	}
	
	public void printName() {
		System.out.println("Customer name : " + this.name);
	}

	public void printURL() {
		System.out.println("Customer website : " + this.url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}
	
	//Run afterPropertiesSet() after all bean properties have been set.
	//Use annotation or implement interfaces
//	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Container is destroy! CustomerService clean up");
	}

	//Run destroy() after Spring container is released the bean.
//	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init method after properties are set : " + message);
	}

}

package com.yulartech.templateDomain;

public class CustomerDB {

	int custId;
	String name;
	int age;
	
	public CustomerDB(){
		
	}
	
	public CustomerDB(int custId, String name, int age){
		this.custId = custId;
		this.name = name;
		this.age = age;
	}
	
	public void setCustId(int custId){
		this.custId = custId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getCustId(){
		return custId;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
}

package com.yulartech.templateDomain;

public class Person {
	
	private String name;
	private String address;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter and setter methods
	public String toString(){
		return "Person [address=" + address + ", age=" + age + ", name=" + name + "]";
	}
	
}

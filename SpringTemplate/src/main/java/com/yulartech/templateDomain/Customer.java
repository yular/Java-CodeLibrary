package com.yulartech.templateDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Customer {
	
/*	//Variables for Spring EL
  	private boolean testEqual;	
	private boolean testNotEqual;
	private boolean testLessThan;
	private boolean testLessThanOrEqual;
	private boolean testGreaterThan;
	private boolean testGreaterThanOrEqual;
	//Logical operators , numberBean.no == 999
	private boolean testAnd;
	private boolean testOr;
	private boolean testNot;
	//Mathematical operators
	private double testAdd;
	private String testAddString;
	private double testSubtraction;
	private double testMultiplication;
	private double testDivision;
	private double testModulus;
	private double testExponentialPower; 
	private boolean warning; */
	
	private String name;
	private String address;
	private int age;
	private String url;
	
	private Item item;
	private String itemName;
	
	//Autowired annotation example
	@Autowired
	@Qualifier("templatePersonBean2")
	private Person person;
	
	public Customer(){
		
	}
	
	public Customer(String name, String address, int age){
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public Customer(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setUrl(String url){
		this.url = url;
	}
	
	public void setItem(Item item){
		this.item = item;
	}
	
	public void setItemName(String itemname){
		this.itemName = itemName;
	}
	
/*	public void setWarning(boolean warning) {
		this.warning = warning;
	} */
	
	//getter and setter methods
	public String toString(){
		return " name : " +name + "\n address : "
               + address + "\n age : " + age + "\n p-name : " + person.getName();
	}
	
}

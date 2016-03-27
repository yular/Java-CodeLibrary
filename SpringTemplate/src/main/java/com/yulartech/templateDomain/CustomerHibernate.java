package com.yulartech.templateDomain;

import java.util.Date;

public class CustomerHibernate {

	private long customerId;
	private String name;
	private String address;
	private Date createdDate;
	
	public long getCustomerId(){
		return customerId;
	}
	
	public void setCustomerId(long customerId){
		this.customerId = customerId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setCreatedDate(Date createdDate){
		this.createdDate = createdDate;
	}
	
	public Date getCreatedDate(){
		return createdDate;
	}
}

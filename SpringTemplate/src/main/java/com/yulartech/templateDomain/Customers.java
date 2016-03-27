package com.yulartech.templateDomain;

public class Customers {

	private int type;
	private String action;
	private String Country;
	
	public int getType(){
		return type;
	}
	
	public String getAction(){
		return action;
	}
	
	public String getCountry(){
		return Country;
	}

	public void setType(int type){
		this.type = type;
	}
	
	public void setAction(String action){
		this.action = action;
	}
	
	public void setCountry(String country){
		this.Country = country;
	}
	
	//getter and setter methods
	public String toString(){
		return " type : " +type + "\n action : "
               + action + "\n Country : " + Country;
	}
		
}

package com.yulartech.template.domain;

public class Shop {
	
	String name;
	String staffName[];
	String itemName[];
	
	public Shop(){
		this.name = "";
		this.staffName = new String[2];
		this.itemName = new String[2];
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String[] getStaffName(){
		return staffName;
	}
	
	public void setStaffName(String[] staffName){
		this.staffName = staffName;
	}
	
	public String[] getItemName(){
		return itemName;
	}
	
	public void setItemName(String[] itemName){
		this.itemName = itemName;
	}
}

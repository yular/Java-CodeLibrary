package com.yulartech.templateDomain;

public class Item {
	
	private String name;
	private int qty;
	private int qtyOnHand;
	
	public Item(){
		
	}
	
	public Item(String name, int qty){
		this.name = name;
		this.qty = qty;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setQty(int qty){
		this.qty = qty;
	}
	
	public void setQtyOnHand(int qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
	}
	
}

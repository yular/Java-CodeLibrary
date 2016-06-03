package com.yulartech.template.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseDTO {
	
	private int val;
	private List<String> lst;
	
	public ResponseDTO(){
		this.val = 0;
		this.lst = new ArrayList<String>();
	}
	
	public void setVal(int val){
		this.val = val;
	}
	
	public int getVal(){
		return val;
	}
	
	public void setLst(List<String> lst){
		this.lst = lst;
	}
	
	public List<String> getLst(){
		return lst;
	}
}

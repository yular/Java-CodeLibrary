package com.yulartech.templateDomain;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;

public class Consumer {
	
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	private Properties pros;
	private Date date;
	private int type;
	private String action;
	
	private Person person;
	
	public Consumer(){
		
	}

	public Consumer(Person person) {
		this.person = person;
	}

	/*
	 * @Required in setPerson() method to make sure the person property has been set
	 */
	@Required
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public List<Object> getLists(){
		return this.lists;
	}
	
	public Set<Object> getSet(){
		return this.sets;
	}
	
	public Map<Object, Object> getMaps(){
		return this.maps;
	}
	
	public Properties getPros(){
		return this.pros;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public void setLists(List<Object> lists){
		this.lists = lists;
	}
	
	public void setSets(Set<Object> sets){
		this.sets = sets;
	}
	
	public void setMaps(Map<Object, Object> maps){
		this.maps = maps;
	}
	
	public void setPros(Properties pros){
		this.pros = pros;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public void setType(int type){
		this.type = type;
	}
	
	public void setAction(String action){
		this.action = action;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", lists="+ lists +", maps= "+ maps +", pros= "+pros+", sets= "+sets+", date= "+date+"]";
	}
	
}

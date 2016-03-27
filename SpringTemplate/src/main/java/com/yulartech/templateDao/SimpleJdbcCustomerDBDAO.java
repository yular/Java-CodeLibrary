package com.yulartech.templateDao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SimpleJdbcCustomerDBDAO {

DriverManagerDataSource dataSource;
	
	public void setDataSource(DriverManagerDataSource dataSource){
		this.dataSource = dataSource;
	}
}

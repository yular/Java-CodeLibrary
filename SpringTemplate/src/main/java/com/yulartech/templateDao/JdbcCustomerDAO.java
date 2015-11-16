package com.yulartech.templateDao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcCustomerDAO {

	DriverManagerDataSource dataSource;
	
	public void setDataSource(DriverManagerDataSource dataSource){
		this.dataSource = dataSource;
	}
}

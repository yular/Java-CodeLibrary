package com.yulartech.templateDao;

import com.yulartech.templateDomain.CustomerDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDBDAO extends SimpleJdbcDaoSupport implements CustomerDBDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
/*	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
*/	
	public void insert(CustomerDB customer) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CUSTOMER " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
					 
		getJdbcTemplate().update(sql, new Object[] { customer.getCustId(),
				customer.getName(),customer.getAge()  
		});
		
	}

	public CustomerDB findByCustomerId(int custId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		
		CustomerDB customer = (CustomerDB)getJdbcTemplate().queryForObject(
				sql, new Object[] { custId }, new CustomerDBRowMapper());
		
	/*	CustomerDB customer = (CustomerDB)getSimpleJdbcTemplate().queryForObject(
				sql, new CustomerDBParameterizedRowMapper(), custId); */
		
		return customer;
	}
	
	public CustomerDB findByCustomerId2(int custId){
		 
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
	 
		CustomerDB customer = (CustomerDB)getJdbcTemplate().queryForObject(
				sql, new Object[] { custId }, new BeanPropertyRowMapper(CustomerDB.class));
		
/*		CustomerDB customer1 = getSimpleJdbcTemplate().queryForObject(sql,
		          ParameterizedBeanPropertyRowMapper.newInstance(CustomerDB.class), custId); */
		
		return customer;
	}
	
	public List<CustomerDB> findAll(){
		
		String sql = "SELECT * FROM CUSTOMER";
			
		List<CustomerDB> customers  = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(CustomerDB.class));
		
//		List<CustomerDB> customers = getSimpleJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(CustomerDB.class));
		
		return customers;
	}
	
	public List<CustomerDB> findAll2() {
		String sql = "SELECT * FROM CUSTOMER";
		
		List<CustomerDB> customers = new ArrayList<CustomerDB>();
		
		List<Map> rows = getJdbcTemplate().queryForList(sql);
		for (Map row : rows) {
			CustomerDB customer = new CustomerDB();
			customer.setCustId((Integer)(row.get("CUST_ID")));
			customer.setName((String)row.get("NAME"));
			customer.setAge((Integer)row.get("AGE"));
			customers.add(customer);
		}
			
		return customers;
	}
	
	public String findCustomerNameById(int custId){
		
		String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";
			 
		String name = (String)getJdbcTemplate().queryForObject(sql, new Object[] { custId }, String.class);
		
	//	String name = getSimpleJdbcTemplate().queryForObject(sql, String.class, custId);
		
		return name;
	}
	
	public int findTotalCustomer(){
		
		String sql = "SELECT COUNT(*) FROM CUSTOMER";
			 
//		int total = getJdbcTemplate().queryForInt(sql);
		int total = getSimpleJdbcTemplate().queryForInt(sql);
					
		return total;
	}
	
	//insert with named parameter
	public void insertNamedParameter(CustomerDB customer){
			
		String sql = "INSERT INTO CUSTOMER " +
			"(CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)";
			
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("custId", customer.getCustId());
		parameters.put("name", customer.getName());
		parameters.put("age", customer.getAge());
			
		getSimpleJdbcTemplate().update(sql, parameters);
				
	}
	
	public void insertBatchNamedParameter(final List<CustomerDB> customers){
		
		String sql = "INSERT INTO CUSTOMER " +
		"(CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)";
				
		List<SqlParameterSource> parameters = new ArrayList<SqlParameterSource>();
		for (CustomerDB cust : customers) {
			parameters.add(new BeanPropertySqlParameterSource(cust)); 
		}
		
		getSimpleJdbcTemplate().batchUpdate(sql, parameters.toArray(new SqlParameterSource[0]));
	}
	
	public void insertBatchNamedParameter2(final List<CustomerDB> customers){
		
	   SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(customers.toArray());
		
	   getSimpleJdbcTemplate().batchUpdate("INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)", params);
		
	}
	
	//insert batch example
	public void insertBatch(final List<CustomerDB> customers){
			
	  String sql = "INSERT INTO CUSTOMER " +
		"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
	  
	  List<Object[]> parameters = new ArrayList<Object[]>();
				
	  for(CustomerDB cust : customers) {
	        parameters.add(new Object[] {cust.getCustId(), cust.getName(), cust.getAge()});
	  }
	  
	  getSimpleJdbcTemplate().batchUpdate(sql, parameters); 
	    
	}
	
	//insert batch example with SQL
	public void insertBatchSQL(final String sql){
			
		getJdbcTemplate().batchUpdate(new String[]{sql});
			
	}

}

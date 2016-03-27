package com.yulartech.templateDao;

import java.util.List;

import com.yulartech.templateDomain.CustomerDB;

public interface CustomerDBDAO {

	public void insert(CustomerDB customer);
	public CustomerDB findByCustomerId(int custId);
	public CustomerDB findByCustomerId2(int i);
	public List<CustomerDB> findAll();
	public List<CustomerDB> findAll2();
	public String findCustomerNameById(int i);
	public int findTotalCustomer();
	public void insertBatchNamedParameter2(final List<CustomerDB> customers);
	public void insertBatch(final List<CustomerDB> customers);
	public void insertBatchSQL(final String sql);
	
}

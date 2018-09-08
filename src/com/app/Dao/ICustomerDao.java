package com.app.Dao;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerDao {
	public int SaveCustomer(Customer cust);
	public void UpdateCustomer(Customer cust);
	public void DeleteCustomer(int custId);
	public Customer getCustomerById(int custId);
	public List<Customer> getAllCustomers();
	public List<Object[]> getCustomerType();
	//public Customer getCustomerByEmail(String custEmail);

}

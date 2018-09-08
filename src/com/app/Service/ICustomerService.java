package com.app.Service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {
	public int SaveCustomer(Customer cust);
	public void UpdateCustomer(Customer cust);
	public void DeleteCustomer(int custId);
	public Customer getCustomerById(int custId);
	public List<Customer> getAllCustomers();
	public List<Object[]> getCustomerType();


}

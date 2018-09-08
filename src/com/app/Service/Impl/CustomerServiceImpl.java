package com.app.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.ICustomerDao;
import com.app.Service.ICustomerService;
import com.app.model.Customer;
@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerDao dao;

	public int SaveCustomer(Customer cust) {
		return dao.SaveCustomer(cust);
	}

	public void UpdateCustomer(Customer cust) {
		dao.UpdateCustomer(cust);
	}

	public void DeleteCustomer(int custId) {
		dao.DeleteCustomer(custId);
		
	}

	public Customer getCustomerById(int custId) {
		return dao.getCustomerById(custId);
	}

	public List<Customer> getAllCustomers() {
		return dao.getAllCustomers();
	}

	public List<Object[]> getCustomerType() {
		return dao.getCustomerType();
	}

	

}

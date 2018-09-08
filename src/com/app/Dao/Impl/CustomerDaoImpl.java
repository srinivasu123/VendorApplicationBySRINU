package com.app.Dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.Dao.ICustomerDao;
import com.app.model.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao {
	@Autowired
	private HibernateTemplate ht;

	public int SaveCustomer(Customer cust) {
		Integer custId=(Integer) ht.save(cust);
		return custId;
	}

	public void UpdateCustomer(Customer cust) {
ht.update(cust);
	}

	public void DeleteCustomer(int custId) {
		Customer cust=new Customer();
				cust.setCustId(custId);
		ht.delete(cust);

	}

	public Customer getCustomerById(int custId) {
		Customer cust=ht.get(Customer.class, custId);
		return cust;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> lists=ht.loadAll(Customer.class);
		return lists;
	}

	public List<Object[]> getCustomerType() {
		
		String hql="select custType ,count(custType) from com.app.model.Customer group by custType";
		List<Object[]> list=ht.find(hql);
		
		
		return list;
	}

}

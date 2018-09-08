package com.app.Dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.Dao.IVendorDao;
import com.app.model.Vendor;
@Repository
public class VendorDaoImpl implements IVendorDao {
	@Autowired
	private HibernateTemplate ht;

	public int SaveVendor(Vendor ven) {
		Integer venId=(Integer) ht.save(ven);
		
		return venId;
	}

	public void UpdateVendor(Vendor ven) {
		ht.update(ven);
		
		
	}

	public void DeleteVendor(int venId) {
		
		Vendor ven=new Vendor();
		ven.setVenid(venId);
		ht.delete(ven);
		
	}

	public Vendor getVendorById(int venId) {
		
		
		return ht.get(Vendor.class, venId);
	}

	public List<Vendor> getAllVendors() {
		return ht.loadAll(Vendor.class);
	}

	public List<Object[]> getVendorType() {
		
		String hql="select venType ,count(venType) from com.app.model.Vendor group by venType";
		List<Object[]> list=ht.find(hql);
		
		
		return list;
	}

}

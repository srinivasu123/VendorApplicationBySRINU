package com.app.Dao;

import java.util.List;

import com.app.model.Vendor;


public interface IVendorDao {
	public int SaveVendor(Vendor ven);
	public void UpdateVendor(Vendor loc);
	public void DeleteVendor(int venId);
	public Vendor getVendorById(int venId);
	public List<Vendor> getAllVendors();
	public List<Object[]> getVendorType();

}

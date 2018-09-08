package com.app.Service;

import java.util.List;

import com.app.model.Vendor;

public interface IVendorService {
	public int SaveVendor(Vendor ven);
	public void UpdateVendor(Vendor ven);
	public void DeleteVendor(int venId);
	public Vendor getVendorById(int venId);
	public List<Vendor> getAllVendors();
	public List<Object[]> getVendorType();

}

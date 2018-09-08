package com.app.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.IVendorDao;
import com.app.Service.IVendorService;
import com.app.model.Vendor;
@Service
public class VendorServiceImpl implements IVendorService {
	@Autowired
	private IVendorDao dao;

	public int SaveVendor(Vendor ven) {
		return dao.SaveVendor(ven);
	}

	public void UpdateVendor(Vendor ven) {
		dao.UpdateVendor(ven);
	}

	public void DeleteVendor(int venId) {
		dao.DeleteVendor(venId);
	}

	public Vendor getVendorById(int venId) {
		return dao.getVendorById(venId);
	}

	public List<Vendor> getAllVendors() {
		return dao.getAllVendors();
	}

	public List<Object[]> getVendorType() {
		return dao.getVendorType();
	}

}

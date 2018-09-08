package com.app.Service.Impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.ILocationDAO;
import com.app.Service.ILocationService;
import com.app.model.Location;
@Service
public class LocationServiceImpl implements ILocationService {
	@Autowired
	private ILocationDAO dao;

	public int SaveLocation(Location loc) {
		return dao.SaveLocation(loc);
	}

	public void UpdateLocation(Location loc) {
		dao.UpdateLocation(loc);
	}

	public void DeleteLocation(int locId) {
		// TODO Auto-generated method stub
		dao.DeleteLocation(locId);
	}

	public Location getLocationById(int locId) {
		// TODO Auto-generated method stub
		return dao.getLocationById(locId);
	}

	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		List<Location> locs= dao.getAllLocations();
		Collections.sort(locs,new Comparator<Location>() {
			public int compare(Location obj1, Location obj2){
				return obj1.getLocId()-obj2.getLocId();
				
			}
		});
		
		
		return locs;
	}

	public List<Object[]> getLocationType() {
		
		
		return dao.getLocationType();
	}
	

}

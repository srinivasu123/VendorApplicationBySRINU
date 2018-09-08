package com.app.Dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.Dao.ILocationDAO;
import com.app.model.Location;
@Repository
public class LocationDaoImpl implements ILocationDAO {
	@Autowired
	private HibernateTemplate ht;

	public int SaveLocation(Location loc) {
		return (Integer)ht.save(loc);
	}

	public void UpdateLocation(Location loc) {
ht.update(loc);		
	}

	public void DeleteLocation(int locId) {
		Location loc=new Location();
		loc.setLocId(locId);
		ht.delete(loc);
	}

	public Location getLocationById(int locId) {
		return ht.get(Location.class, locId);
	}

	public List<Location> getAllLocations() {
		return ht.loadAll(Location.class);
	}

	public List<Object[]> getLocationType() {
		String hql="select LocType ,count(LocType) from com.app.model.Location group by LocType";
		List<Object[]> list=ht.find(hql);
		
		
		return list;
	}

}

package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Loctab")
public class Location {
	@Id
	@Column(name="LId")
	private int locId;
	@Column(name="LName")
	private String LocName;
	@Column(name="LCode")
	private String LocCode;
	@Column(name="LType")
	private String LocType;
	@Column(name="Ldesc")
	private String LocDesc;
	public Location() {

	}
	
	public Location(int locId) {
		this.locId = locId;
	}
	

	public Location(int locId, String locName, String locCode, String locType, String locDesc) {
		this.locId = locId;
		LocName = locName;
		LocCode = locCode;
		LocType = locType;
		LocDesc = locDesc;
	}

	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return LocName;
	}
	public void setLocName(String locName) {
		LocName = locName;
	}
	public String getLocCode() {
		return LocCode;
	}
	public void setLocCode(String locCode) {
		LocCode = locCode;
	}
	public String getLocType() {
		return LocType;
	}
	public void setLocType(String locType) {
		LocType = locType;
	}
	public String getLocDesc() {
		return LocDesc;
	}
	public void setLocDesc(String locDesc) {
		LocDesc = locDesc;
	}

	@Override
	public String toString() {
		return "Location [locId=" + locId + ", LocName=" + LocName + ", LocCode=" + LocCode + ", LocType=" + LocType
				+ ", LocDesc=" + LocDesc + "]";
	}
	
	
	

}

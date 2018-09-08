package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventab")
public class Vendor {
	@Id
	@Column(name="vId")
	private int venid;
	@Column(name="vCode")
	private String vencode;
	@Column(name="vName")
	private String venName;
	@Column(name="vType")
	private String venType;
	@Column(name="vAddress")
	private String addr;
	@Column(name="vIdtype")
	private String idType;
	@Column(name="vIdnum")
	private String idNum;
	@Column(name="vdsc")
	private String dsc;
	public int getVenid() {
		return venid;
	}
	public void setVenid(int venid) {
		this.venid = venid;
	}
	public String getVencode() {
		return vencode;
	}
	public void setVencode(String vencode) {
		this.vencode = vencode;
	}
	public String getVenName() {
		return venName;
	}
	public void setVenName(String venName) {
		this.venName = venName;
	}
	public String getVenType() {
		return venType;
	}
	public void setVenType(String venType) {
		this.venType = venType;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getDsc() {
		return dsc;
	}
	public void setDsc(String dsc) {
		this.dsc = dsc;
	}
	@Override
	public String toString() {
		return "Vendor [venid=" + venid + ", vencode=" + vencode + ", venName=" + venName + ", venType=" + venType
				+ ", addr=" + addr + ", idType=" + idType + ", idNum=" + idNum + ", dsc=" + dsc + "]";
	}
	
	
	

}

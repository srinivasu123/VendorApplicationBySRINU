package com.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CustTab")


public class Customer implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	@Column(name="cId")
	private int custId;
	@Column(name="cName")
	private String custName;
	@Column(name="Email")
	private String custEmail;
	@Column(name="Type")
	private String custType;
	@Column(name="Address")
	private String custAddress;
	@Column(name="pwd")
	private String password;
	@Column(name="Token")
	private String acctoken;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAcctoken() {
		return acctoken;
	}
	public void setAcctoken(String acctoken) {
		this.acctoken = acctoken;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custType="
				+ custType + ", custAddress=" + custAddress + ", password=" + password + ", acctoken=" + acctoken + "]";
	}
	

}

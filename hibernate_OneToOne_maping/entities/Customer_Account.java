package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer_Account {
	
	@Id
	long Account_number;
	String branch_name;
	String account_type;
	
	@OneToOne
	Aadhar_details aa;

	public long getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(long account_number) {
		Account_number = account_number;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Aadhar_details getAa() {
		return aa;
	}

	public void setAa(Aadhar_details aa) {
		this.aa = aa;
	}

	public Customer_Account(long account_number, String branch_name, String account_type, Aadhar_details aa) {
		super();
		Account_number = account_number;
		this.branch_name = branch_name;
		this.account_type = account_type;
		this.aa = aa;
	}

	public Customer_Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

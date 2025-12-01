package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar_details {
	
	@Id
	long aadhaar_number;
	String name;
	String date_of_birth;
	String address;
	long MoNO;
	
	
	public long getAadhaar_number() {
		return aadhaar_number;
	}
	public void setAadhaar_number(long aadhaar_number) {
		this.aadhaar_number = aadhaar_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMoNO() {
		return MoNO;
	}
	public void setMoNO(long moNO) {
		MoNO = moNO;
	}
	public Aadhar_details(long aadhaar_number, String name, String date_of_birth, String address, long moNO) {
		super();
		this.aadhaar_number = aadhaar_number;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.address = address;
		MoNO = moNO;
	}
	public Aadhar_details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Aadhar_details [aadhaar_number=" + aadhaar_number + ", name=" + name + ", date_of_birth="
				+ date_of_birth + ", address=" + address + ", MoNO=" + MoNO + "]";
	}
	
	
	
	
	
	
	
	
	

}

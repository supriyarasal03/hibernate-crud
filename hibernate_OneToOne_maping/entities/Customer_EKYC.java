package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer_EKYC {
	
	@Id
	int kyc_id;
	String verfication_date;
	String verfication_status;
	
	
	@OneToOne
	Aadhar_details a;


	public int getKyc_id() {
		return kyc_id;
	}


	public void setKyc_id(int kyc_id) {
		this.kyc_id = kyc_id;
	}


	public String getVerfication_date() {
		return verfication_date;
	}


	public void setVerfication_date(String verfication_date) {
		this.verfication_date = verfication_date;
	}


	public String getVerfication_status() {
		return verfication_status;
	}


	public void setVerfication_status(String verfication_status) {
		this.verfication_status = verfication_status;
	}


	public Aadhar_details getA() {
		return a;
	}


	public void setA(Aadhar_details a) {
		this.a = a;
	}


	public Customer_EKYC(int kyc_id, String verfication_date, String verfication_status, Aadhar_details a) {
		super();
		this.kyc_id = kyc_id;
		this.verfication_date = verfication_date;
		this.verfication_status = verfication_status;
		this.a = a;
	}


	public Customer_EKYC() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Customer_EKYC [kyc_id=" + kyc_id + ", verfication_date=" + verfication_date + ", verfication_status="
				+ verfication_status + ", a=" + a + "]";
	}
	

}

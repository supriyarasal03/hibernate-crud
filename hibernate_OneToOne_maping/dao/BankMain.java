package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Aadhar_details;
import com.entities.Customer_Account;
import com.entities.Customer_EKYC;



public class BankMain {
	
		
	public void insertdata() {
		
		
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Aadhar_details.class);
		cfg.addAnnotatedClass(Customer_Account.class);
		cfg.addAnnotatedClass(Customer_EKYC.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=  sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Aadhar_details a = new Aadhar_details();
		a.setAadhaar_number(1234566789);
		a.setAddress("pune");
		a.setDate_of_birth("7-jan-2018");
		a.setMoNO(234567768);
		a.setName("Supriya Rasal");
		
		ss.persist(a);
		
		
		Customer_Account c= new Customer_Account();
		c.setAccount_number(1234678);
		c.setAccount_type("saving");
		c.setBranch_name("Dharashiv");
		c.setAa(a);
		
		ss.persist(c);
		
		
		
		
		 Customer_EKYC  ec = new Customer_EKYC();
		 ec.setKyc_id(447);
		 ec.setVerfication_date("3-feb-2024");
		 ec.setVerfication_status("success");
		 ec.setA(a);
		
		
		ss.persist(ec);
		
		tr.commit();
		
		System.out.println("insert successfully");
		
		
		ss.close();
		sf.close();
		
		
	}

}

package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity_demo.Library;

public class Library_insert {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=  sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Library l= new Library();
		
		l.setAuthor("abdual kalam");
		l.setName("wings of fire");
		l.setPrice(500);
		l.setPublication("ssss");
		
		ss.persist(l);
		
		System.out.println("Data is Inserted.... !");

		tr.commit();
		ss.close();
		
	}

}

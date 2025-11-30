package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity_demo.Library;

public class Library_delete {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		
		Transaction tr=ss.beginTransaction();
		
		
		 Library l= new Library();
		 
		int book_no=2;
		
		l.setBook_no(book_no);
		ss.remove(l);
		
		tr.commit();
		ss.close();
		
	}

}

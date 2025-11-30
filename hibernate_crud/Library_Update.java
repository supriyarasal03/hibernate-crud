package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity_demo.Library;

public class Library_Update {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		
		Transaction tr=ss.beginTransaction();
		
		int book_no=2;
		
		Library l= ss.get(Library.class, book_no);
		l.setAuthor("sane sir");
		
		ss.merge(l);
		System.out.println("data updated");
		
		tr.commit();
		ss.close();
		
		
		
		
		
		
	}

}

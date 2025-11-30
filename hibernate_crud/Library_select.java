package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity_demo.Library;

public class Library_select {
	
public static void main(String[] args) {
	
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Library.class);
	
	SessionFactory sf= cfg.buildSessionFactory();
	Session ss= sf.openSession();
	
	Transaction tr=ss.beginTransaction();
	
	
	
	 
	 int book_no=1;
	 
	 Library s = ss.get(Library.class, book_no);  // 5 = id
	 System.out.println(s.getName());
	 System.out.println(s.getAuthor());
	 System.out.println(s.getPrice());
	 System.out.println(s.getPublication());
	 
	 
	 
	 
	 
	 tr.commit();
		ss.close();
	 
}
}

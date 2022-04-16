package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		Laptop lop=new Laptop();
		lop.setLid(1);
		lop.setLname("samsung");
		lop.setLprice(56689);
		
		Student sob=new Student();
		sob.setSid(1);
		sob.setSname("kiran");
		sob.setSmarks(15);
	    sob.setLp(lop);
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(lop);
		ses.save(sob);
		tx.commit();
	

	}

}

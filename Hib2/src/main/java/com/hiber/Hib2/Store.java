package com.hiber.Hib2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {

	public static void main(String[] args) {
   SessionFactory factory=new Configuration().configure().buildSessionFactory();
   Session session=factory.openSession();
   Transaction t=session.beginTransaction();
   Employee e=new Employee();
   e.setEid(1);
   e.setEname("ajay");
   
   Address a=new Address();
   a.setAid(1);
   a.setAddressline("street2");
   a.setCity("hyd");
   a.setState("tel");
   a.setCountry("india");
   e.setAddress(a);
   a.setEmployee(e);
   session.save(e);
   session.save(a);
   t.commit();
   session.close();
   System.out.println("success");
	}

}

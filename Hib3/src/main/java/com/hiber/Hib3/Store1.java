package com.hiber.Hib3;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store1 {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	Answer a=new Answer();
	a.setAnswername("john");
	a.setPostedBy("john");
	Answer b=new Answer();
	b.setAnswername("ali");
	b.setPostedBy("ali");
	Question q=new Question();
	q.setQname("what is your name");
	ArrayList<Answer> al=new ArrayList<Answer>();
	al.add(a);
	al.add(b);
	q.setAnswers(al);
	session.save(q);
	t.commit();
	session.close();
	System.out.println("success");
	
}
}

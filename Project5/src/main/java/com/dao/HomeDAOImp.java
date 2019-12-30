package com.dao;

import java.awt.Image;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.pojo.Main;


@Repository
@Transactional
public class HomeDAOImp implements HomeDAO {
	
	@Autowired(required = true)
	SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")   
	@Transactional
	public List<Main> listCategory(String product_list) {
		Session session =sessionFactory.getCurrentSession();
		
		Query q= session.createQuery("from Main where product_list='men'");
		 List<Main> list= ((org.hibernate.Query) q).list();
		
		return list;
	}
	
	
	
	  @SuppressWarnings("unchecked")
	  
	  @Transactional public List<Main> listCategory1(String product_list) { Session
	  session =sessionFactory.getCurrentSession();
	  

		Query q= session.createQuery("from Main where product_list='women'");
		 List<Main> list1= ((org.hibernate.Query) q).list();
		
		return list1;
	  }
	  
	  
	
	   @SuppressWarnings("unchecked")
	  
	  @Transactional public List<Main> list(int product_id) { Session
	  session =sessionFactory.getCurrentSession();
	  
	  
	  Query q= session.createQuery("from Main where product_id='"+product_id+"'");
	  List<Main> list2= ((org.hibernate.Query) q).list();
	  
	  return list2; }
	 
	

}
	


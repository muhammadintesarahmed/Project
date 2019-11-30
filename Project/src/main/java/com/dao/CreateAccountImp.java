package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pojo.CreateAccount;
@Repository
@Transactional
public class CreateAccountImp implements CreateAccountDAO {

	@Autowired(required = true)
	SessionFactory sessionFactory;

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void register(CreateAccount ca) {
		sessionFactory.getCurrentSession().save(ca);
	}
}

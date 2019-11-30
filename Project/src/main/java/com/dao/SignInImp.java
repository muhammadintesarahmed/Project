package com.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pojo.SignIn;

@Repository
@Transactional
public class SignInImp implements SignInDAO {

	@Autowired(required = true)
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean signIn(SignIn si) {
		Session session=sessionFactory.getCurrentSession();
	    Query q=session.createQuery("from login where email='"+si.getEmail()+"'");
	    		if(q!=null) {
	    			return true;
	    		}
	    		else
	    			return false;
		
	}

}

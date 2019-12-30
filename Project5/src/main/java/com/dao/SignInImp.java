package com.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import com.pojo.SignIn;
import com.pojo.CreateAccount;
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
		System.out.println("sss");
		Session session=sessionFactory.getCurrentSession();
	    Query q=session.createQuery("select count(*) from SignIn where email='"+si.getEmail()+"' and password='"+si.getPassword()+"'");
	    System.out.println(session);
	    System.out.println("aaa");
	    System.out.println(q.getResultList());
	    long res=(long) q.getResultList().get(0); 
	    		if(res==1) {
	    
	    			return true;
	    		}
	    		else
	    			return false;
		
	}

}

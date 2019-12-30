package com.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.context.request.WebRequest;

import com.pojo.Main;
import com.pojo.Orders;
import com.pojo.SignIn;

import jdk.nashorn.internal.runtime.ListAdapter;

@Repository
public class CartDAOImp implements CartDAO {

	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void save(Orders order, Main main) {
		/*
		 * Session session=this.sessionFactory.getCurrentSession(); Orders list=(Orders)
		 * session.createQuery("from Orders where Order_id='"+ order.getOrder_id()
		 * +"'").getSingleResult(); order.setEmail(list.getEmail());
		 * order.setPrize(list.getPrize()); order.setQuantity(list.getQuantity());
		 * order.setAddress(list.getAddress()); order.setOrder_id(list.getOrder_id());
		 * order.setSubTotal((list.getPrize())*(list.getQuantity()));
		 */
		/*
		 * main.setQuantity(main.getQuantity()-order.getQuantity());
		 * sessionFactory.getCurrentSession().save(main);
		 */
		// Session session=this.sessionFactory.getCurrentSession();
		// session.createQuery("update Main set
		// quantity=quantity-'"+order.getQuantity()+"' where
		// product_id='"+order.getProduct_id()+"'");
		order.setSubTotal(order.getPrize() * order.getQuantity());
		sessionFactory.getCurrentSession().createQuery("update Main set quantity=quantity-'"+order.getQuantity()+"' where product_id='"+order.getProduct_id()+"'").executeUpdate();
		sessionFactory.getCurrentSession().save(order);

	}

	@Transactional
	public boolean validation(SignIn si) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("select count(*) from SignIn where email='" + si.getEmail() + "'");
		long res = (long) q.getResultList().get(0);
		if (res == 1) {
			return true;
		} else
			return false;

	}

	/*
	 * @Transactional public void sub(Orders order) { Session
	 * session=sessionFactory.getCurrentSession(); session.
	 * createQuery("from SignIn where product_id='"+order.getProduct_id()
	 * +"'and quantity=quantity-'" +order.getQuantity()+"'"); }
	 */

	@Transactional
	public boolean legal(SignIn si) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("select count(*) from SignIn where email='" + si.getEmail() + "' and password='"
				+ si.getPassword() + "'");
		long res = (long) q.getResultList().get(0);
		if (res == 1) {
			return true;
		} else
			return false;

	}

	/*
	 * public void empty(@SessionAttribute("signIn") SignIn si,int quantity,int
	 * prize,String email) { Session
	 * session=this.sessionFactory.getCurrentSession(); Orders list=(Orders)
	 * session.createQuery("from Orders where email='"+ email
	 * +"'").getSingleResult(); System.out.println("the sesssion user email is " +
	 * si.getEmail()); Orders or=new Orders(); or.setEmail(list.getEmail());
	 * or.setPrize(list.getPrize()); or.setQuantity(list.getQuantity());
	 * or.setAddress(list.getAddress()); or.setOrder_id(list.getOrder_id());
	 * or.setSubTotal((list.getPrize())*(quantity)); session.save(or);
	 * 
	 * }
	 */
	@Transactional
	public List<Orders> order(SignIn si) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("kkk");
		List<Orders> list = session.createQuery("from Orders where email='" + si.getEmail() + "'").list();
		return list;
	}

	@Transactional
	public void delete(int order_id) {
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("delete from Orders where order_id='" + order_id + "'").executeUpdate();
	}

}

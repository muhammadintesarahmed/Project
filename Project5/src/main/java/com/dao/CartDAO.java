package com.dao;

import java.util.List;


import com.pojo.Main;
import com.pojo.Orders;
import com.pojo.SignIn;

public interface CartDAO {

	public void save(Orders order, Main main);

	public boolean validation(SignIn si);

	/* public void sub(Orders order); */
	public boolean legal(SignIn si);

	/* public String cart1(Orders order); */
	public List<Orders> order(SignIn si);

	public void delete(int order_id);
	
	/* public void msg(Orders order); */
	
}

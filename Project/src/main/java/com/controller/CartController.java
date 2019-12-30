package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

import com.dao.CartDAO;
import com.pojo.Main;
//import com.pojo.CreateAccount;
import com.pojo.Orders;
import com.pojo.SignIn;

@Controller
public class CartController {

	@Autowired
	CartDAO cartDAO;

	public CartDAO getCartDAO() {
		return cartDAO;
	}

	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}

	@RequestMapping("/final/{product_id}/{prize}/{quantity}")
	public ModelAndView cart(@ModelAttribute("cart") Orders order) {
		ModelAndView mav = new ModelAndView("cart");
		Orders or = new Orders();
		mav.addObject("order", or);
		System.out.println(or.getEmail());
		return mav;
	}

	@RequestMapping("/final/order")
	public ModelAndView save(@SessionAttribute("signIn") SignIn si, @ModelAttribute("cart") Orders order, Main main) {
		boolean res = getCartDAO().validation(si);
		if (res == false && si==null) {
			ModelAndView mav = new ModelAndView("falseUser");
			mav.addObject("order", new Orders());
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("order");
			/* boolean res1=getCartDAO().sub(order); */
			getCartDAO().save(order, main);
			mav.addObject("order", new Orders());
			return mav;
		}
	}

	@RequestMapping("/empty.htm")
	public ModelAndView order(@SessionAttribute("signIn") SignIn si, @ModelAttribute("order") Orders order) {
		System.out.println("aalldk");
		System.out.println(si);
		
		ModelAndView mav = new ModelAndView("empty", "order", getCartDAO().order(si));
        return mav;
		
			
		}
	

	@RequestMapping("/delete/{order_id}")
	public String delete(@SessionAttribute("signIn") SignIn si,@PathVariable("order_id") int order_id) {

		
		getCartDAO().delete(order_id);
		return "redirect:/empty.htm";
	}

}

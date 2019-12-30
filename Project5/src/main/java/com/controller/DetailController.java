package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.HomeDAO;
import com.pojo.Main;

@Controller
public class DetailController {
	@Autowired
	HomeDAO homeDAO;

	@RequestMapping("/products/{product_type}")
	public ModelAndView men(@PathVariable String product_type) {
		System.out.println("ah");
		ModelAndView model = new ModelAndView("men", "list", homeDAO.listCategory(product_type));
		return model;
	}

	@RequestMapping("/products1/{product_type}")
	public ModelAndView women(@PathVariable String product_type) {
		System.out.println("ah");
		ModelAndView model = new ModelAndView("women", "list1", homeDAO.listCategory1(product_type));
		return model;
	}
	
	
	  @RequestMapping("/productdisplay/{product_id}") public ModelAndView
	 sub(@PathVariable int product_id) { System.out.println("ss");
	  ModelAndView model = new ModelAndView("product", "list2",
	  homeDAO.list(product_id)); return model;
	  
	  }
	 

}

package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dao.SignInDAO;
import com.pojo.CreateAccount;
import com.pojo.SignIn;

@Controller
@SessionAttributes("signIn") 
public class SignInController {

	@Autowired
	private SignInDAO signInDAO;
	

	public SignInDAO getSignInDAO() {
		return signInDAO;
	}

	public void setSignInDAO(SignInDAO signInDAO) {
		this.signInDAO = signInDAO;
	}

	@RequestMapping(value = "/signInForm", method = RequestMethod.GET)
	public String signInForm(Model model) {
		model.addAttribute("signIn", new SignIn());
		return "signIn";

	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public ModelAndView signIn(@ModelAttribute("signIn") SignIn si) {
		System.out.println(si.getEmail());
		System.out.println(si.getPassword());
		
		boolean res = getSignInDAO().signIn(si);
		if (res == true) {
			System.out.println("ihihi");
			ModelAndView mav = new ModelAndView("hello");
			return mav;
		}
		else {
			ModelAndView mav = new ModelAndView("error");
			return mav;
		}
	}

}

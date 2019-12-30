package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.CreateAccountDAO;
import com.pojo.CreateAccount;
import com.pojo.SignIn;

@Controller
public class CreateAccountController {

	@Autowired
	private CreateAccountDAO createAccountDAO;

	public CreateAccountDAO getCreateAccountDAO() {
		return createAccountDAO;
	}

	public void setCreateAccountDAO(CreateAccountDAO createAccountDAO) {
		this.createAccountDAO = createAccountDAO;
	}

	@RequestMapping(value = "/createAccountForm", method = RequestMethod.GET)
	public String createAccountForm(Model model) {
		model.addAttribute("createAccount", new CreateAccount());
		return "createAccount";
	}

	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("createAccount") CreateAccount ca) {
		System.out.println(ca.getEmail());
		System.out.println(ca.getFirstName());
		System.out.println(ca.getId());
		System.out.println(ca.getPassword());

		System.out.println(ca.getMobileNumber());

		getCreateAccountDAO().register(ca);
		ModelAndView mav =new ModelAndView("signIn");
		mav.addObject("signIn",new SignIn());
		return mav;
	}
}

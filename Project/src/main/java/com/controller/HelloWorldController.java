package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Orders;
import com.pojo.SignIn;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello.htm")
	public String home() {
		return "hello";
	}


	// @RequestMapping("/men.htm") public String men(Model m) { return "men"; }

	/*
	 * @RequestMapping("/women.htm") public String women(Model m) { return "women";
	 * }
	 */
	/*
	 * @RequestMapping("/jeans.htm") public String jeans(Model m) { return "jeans";
	 * }
	 */

	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String admin() {
		return "admin";
	}
	
	@RequestMapping(value="/secured/adminUpdate", method = RequestMethod.GET)
	public String adminUpdate() {
		return "adminUpdate";
	}

	@RequestMapping("/logout.htm")
	public String logout(@SessionAttribute("signIn") SignIn si, WebRequest request) {

		request.removeAttribute("signIn", WebRequest.SCOPE_SESSION);
		return "logout";
	}
	
	   
    @RequestMapping(value="/loginError", method = RequestMethod.GET)
    public String loginError(ModelMap model) {
    model.addAttribute("error", "true");
    model.addAttribute("msg", "invalid login credentials");
    return "admin";
     
    }

}

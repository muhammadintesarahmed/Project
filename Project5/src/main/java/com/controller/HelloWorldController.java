package com.controller;







import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.context.request.WebRequest;
import com.pojo.SignIn;



@Controller
public class HelloWorldController {
	 private static final org.apache.log4j.Logger logger = LogManager.getLogger(HelloWorldController.class); 
	@RequestMapping("/hello.htm")
	public String home() {
		 BasicConfigurator.configure();  
		
		 logger.info("home method is working");  
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
		 BasicConfigurator.configure();  
		 logger.info("admin method is working"); 
		
		return "admin";
	}
	
	@RequestMapping(value="/secured/adminUpdate", method = RequestMethod.GET)
	public String adminUpdate() {
		 BasicConfigurator.configure();  
		 logger.info("adminUpdate method is working"); 
		return "adminUpdate";
	}

	@RequestMapping("/logout.htm")
	public String logout(@SessionAttribute("signIn") SignIn si, WebRequest request) {

		request.removeAttribute("signIn", WebRequest.SCOPE_SESSION);
		return "logout";
	}
	
	   
    @RequestMapping("/loginError")
    public String loginError() {
   
    return "loginError";
     
    }

}

package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class HelloWorldController {  
    @RequestMapping("/hello.htm")  
    public String helloWorld(Model m) {   
        return "hello";   
    }  
    
   
}

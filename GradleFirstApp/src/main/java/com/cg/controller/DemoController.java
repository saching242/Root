package com.cg.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {

	   @RequestMapping("/")
	    public String welcome(Map<String, Object> model) {
	        return "welcome";
	    }
	   
	   @RequestMapping("/")
	    public String test(Map<String, Object> model) {
	        return "welcome";
	    }
	   
	   @RequestMapping("/")
	    public String demo(Map<String, Object> model) {
	        return "welcome";
	    }
}

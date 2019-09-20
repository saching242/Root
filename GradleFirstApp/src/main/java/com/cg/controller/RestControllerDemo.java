package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

	@RequestMapping(value="/details", method=RequestMethod.GET)
	public String getDetails() {
		return "Employee Details";
	}
}

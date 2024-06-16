/**
 * 
 */
package com.second.demo.myApplication.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * My First Rest Controller class.
 */
@RestController
public class FirstRestController {

	@Value("${customer.name}")
	private String customerName;
	
	@Value("${customer.team}")
	private String customerTeam;
	
//This would have a simple implementation for handling the '/' Endpoint  and display "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/first")
	public String sayHelloWorld() {
		return "Hello "+customerName+" from "+customerTeam+", My First Sprint Boot Rest Controller";
	}
}

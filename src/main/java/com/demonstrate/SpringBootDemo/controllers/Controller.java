package com.demonstrate.SpringBootDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

	@GetMapping(value = { "/", "" })
	public String sayHello() {
		return "Hello from Bridgelabz";
	}
	
	@GetMapping("/query")
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + " from Bridgelabz";
	}
	
	@GetMapping("/param/{name}")
	public String sayHelloPath(@PathVariable String name) {
		return "Hello " + name + " from Bridgelabz";
	}
	
}

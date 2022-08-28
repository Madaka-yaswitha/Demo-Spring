package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/")
	public void Hello() {
		System.out.println("Welcome to springboot application");
		
	}
	

}

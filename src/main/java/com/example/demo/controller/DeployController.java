package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy/")
public class DeployController {

	@GetMapping
	public String sayHello() {
		return "Welcome to Tech Stack.....";
	}
}

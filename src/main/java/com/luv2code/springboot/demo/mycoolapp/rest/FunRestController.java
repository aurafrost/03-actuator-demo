package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello world! Time: "+LocalDateTime.now();
	}
	@GetMapping("/workout")
	public String getWorkout() {
		return "Do stuff.";
	}
	@GetMapping("/fortune")
	public String getFortune() {
		return "Do fortune stuff.";
	}
}

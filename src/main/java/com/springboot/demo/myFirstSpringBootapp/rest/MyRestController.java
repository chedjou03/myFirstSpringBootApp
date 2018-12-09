package com.springboot.demo.myFirstSpringBootapp.rest;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Value("${coach.name}")
	private String coachName;
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello World coach name is: "+coachName+" Time is "+LocalDateTime.now()+" fuck u Sorry About that";
	}

}

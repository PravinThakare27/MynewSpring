package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringControllerClass {
@GetMapping("/fetch")
public String  page()
{
	return "HEllo";
	
}
}

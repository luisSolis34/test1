package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	
	
	@GetMapping(path="/")
	public String sayHi() {
		
		return "Saludando desde openshift";
	}

}

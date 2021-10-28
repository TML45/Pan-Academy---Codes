package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "/saudacao") //endpoint //Fifth form
//@ComponentScan(basePackages = {"Model"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		//System.out.println("Olha isso!");
	}
	//@RequestMapping  // First way
	//@RequestMapping(method = RequestMethod.GET) // Second way
	//@GetMapping // Third form
	//@RequestMapping(path = "/saudacao") //endpoint //Fourth form
	//@GetMapping //Fourth form //Fifth form
	@GetMapping("/ola") // sixth form
	public String ola() {
		return "Hello Hello Hello World!";
	}
	
	@GetMapping("/ola2") // sixth form
	public String ola2() {
		return "Tentando";
	}


}

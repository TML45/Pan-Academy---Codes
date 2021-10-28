package com.example.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping( path = "/comeco")
@SpringBootApplication
@RestController
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}
	
	@GetMapping("/aprendendo")
	public String escrevendo() {
		return "Aprendizado Constante";
	}
	
	@GetMapping("/keep")
	public String escrevendo2() {
		return "Keep Learning!";
	}
	

}

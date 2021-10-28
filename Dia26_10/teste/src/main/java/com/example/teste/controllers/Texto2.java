package com.example.teste.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/comeco2")
@RestController
public class Texto2 {
	@GetMapping("/bom")
	public String escrevendo() {
		return "O curso está sem muito bom!";
	}

	@GetMapping("/tempo")
	public String escrevendo2() {
		return "O curso podia durar mais!!";
	}

}

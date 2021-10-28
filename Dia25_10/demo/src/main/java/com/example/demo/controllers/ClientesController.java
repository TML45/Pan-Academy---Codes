package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/clientes")
@RestController
public class ClientesController {
	@GetMapping("/clientes2")
	public String ola() {
		return "Lista de Clientes";
	}
	@GetMapping("/compras")
	public String ola2() {
		return "Fazendo compras";
	}

}

package com.inforcap.holahumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {
	@RequestMapping("/")
	public String saludo(@RequestParam(value="firstName", required=false)String firstName,@RequestParam(value="lastName", required=false)String lastName) {
		if (firstName != null && lastName != null) {
			return "<h1>Hola " + firstName + " " + lastName + "</h1></br> <h1>Bienvenido a Sprignboot</h1>";
		}
		else {
			firstName = "Humano";
			lastName = "";
			return "<h1>Hola " + firstName + "</h1></br> <h1>Bienvenido a Sprignboot</h1>";
		}
		
	}
}

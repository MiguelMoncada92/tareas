package com.inforcap.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("/")
	public String hello() {
		return "¡Hola Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "¡Pyhton/Django fue increible";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring es lo mejor";
	}
	
}

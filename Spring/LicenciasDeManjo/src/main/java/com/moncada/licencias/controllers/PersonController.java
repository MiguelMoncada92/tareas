package com.moncada.licencias.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.moncada.licencias.models.Person;
import com.moncada.licencias.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping("/persons")
	public String index(Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("Person", persons);
		return "/persons/index.jsp";
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person")Person person) {
		return "/persons/new.jsp";
	}
	@RequestMapping(value="/persons/new", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute ("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/persons/new.jsp";
		}
		else {
			personService.createPerson(person);
			return "redirect:/persons";
		}
	}
	@RequestMapping("/persons/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Person person = personService.findPerson(id);
		model.addAttribute("person", person);
		return "/person/show.jsp";
	}
	
	
	
	
	
	
	
	
	
}

package com.moncada.licencias.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moncada.licencias.models.License;
import com.moncada.licencias.models.Person;
import com.moncada.licencias.services.LicenseService;
import com.moncada.licencias.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;
	
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	@RequestMapping("/licenses")
	public String index(Model model) {
		List<License> licenses = licenseService.allLicense();
		model.addAttribute("License", licenses);
		return "/licenses/index.jsp";
	}
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license")License license, Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("Person", persons);
		return "/licenses/new.jsp";
	}
	@RequestMapping(value = "licenses/new", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute ("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "/licenses/new.jsp";
		} else {
			licenseService.createLicense(license);
			return "redirect:/licenses";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

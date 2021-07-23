package com.moncada.dojosNinjasControllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moncada.dojosNinjasModels.Dojo;
import com.moncada.dojosNinjasServices.DojoServ;

@Controller
public class DojoContro {
	private final DojoServ dojoServ;
	
	public DojoContro(DojoServ dojoServ) {
		this.dojoServ = dojoServ;
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "/dojos/new.jsp";
	}
	
	@RequestMapping(value="/dojos/new", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute ("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/dojos/new.jsp";
		} else {
			dojoServ.createDojo(dojo);
			return "redirect:/dojos/{id}";
		}
	}
	
	@RequestMapping("/dojos/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dojoServ.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "/dojo/show.jsp";
	}
	
	
	
	
	
}

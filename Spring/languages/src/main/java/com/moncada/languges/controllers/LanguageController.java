package com.moncada.languges.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.moncada.languges.models.Languages;
import com.moncada.languges.service.LanguageService;

@Controller
public class LanguageController {
private final LanguageService languageService;
	
	public LanguageController (LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
	public String index(Model model) {
		List<Languages> Languages = languageService.allLanguages();
		model.addAttribute("Languages", Languages);
		return "languages/index.jsp";
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Languages language = languageService.findLanguage(id);
		model.addAttribute("languages", language);
		return "/languages/edit.jsp";
	}
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute ("languages") Languages languages, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        } else {
            languageService.updateLanguage(languages);
            return "redirect:/languages";
        }
    }
	
	@RequestMapping("/languages/new")
	public String newLang(@ModelAttribute("languages") Languages languages) {
		return "/languages/new.jsp";
	}
	
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute ("languages") Languages languages, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/new.jsp";
		}
		else {
			languageService.createLanguage(languages);
			return "redirect:/languages";
		}
	}
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Languages language = languageService.findLanguage(id);
        model.addAttribute("languages", language);
        return "/languages/show.jsp";
	}
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
}

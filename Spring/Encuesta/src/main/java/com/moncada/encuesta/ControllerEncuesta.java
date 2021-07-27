package com.moncada.encuesta;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ControllerEncuesta {
	@RequestMapping("/")
	public String home() {
		return "/home.jsp";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "/result.jsp";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String show(@RequestParam(value="name")String name,@RequestParam(value="location")String location
			,@RequestParam(value="language")String language,@RequestParam(value="comment")String comment
			,RedirectAttributes redirectAttributes, HttpSession session) {
		if(name.isEmpty()||location.isEmpty()||language.isEmpty()) {
			redirectAttributes.addFlashAttribute("error", "Debes intentar con más campos");
			return "redirect:/";
		} else {
			session.setAttribute(name, name);
			session.setAttribute(location, location);
			session.setAttribute(language, language);
			session.setAttribute(comment, comment);
			return "/result";
		}
	}
	
	
	
	
}

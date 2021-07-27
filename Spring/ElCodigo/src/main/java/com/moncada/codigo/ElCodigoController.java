package com.moncada.codigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ElCodigoController {
	@RequestMapping("/")
	public String index() {
		return "/index.jsp";
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String index(@RequestParam(value="code")String code,RedirectAttributes redirectAttributes) {
		if(code.equalsIgnoreCase("bushido")) {
			return "redirect:/code";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "Debes intentar con más espiritu");
			return "redirect:/";
		}
	}
	@RequestMapping("/code")
	public String code() {
		return "/code.jsp";
	}
	
	
	
}

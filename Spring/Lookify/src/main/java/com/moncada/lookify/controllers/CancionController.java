package com.moncada.lookify.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moncada.lookify.models.Cancion;
import com.moncada.lookify.services.CancionServ;

@Controller
public class CancionController {
	private final CancionServ cancionServ;
	public CancionController (CancionServ cancionServ) {
		this.cancionServ = cancionServ;
	}
	
	
	@RequestMapping("/")
	public String index() {
		return "/index.jsp";
	}
	@RequestMapping("/dashboard")
	public String show(Model model) {
		List<Cancion> cancion = cancionServ.allCanciones();
		model.addAttribute("cancion", cancion);
		return "/dashboard.jsp";
	}
	@RequestMapping("")
}

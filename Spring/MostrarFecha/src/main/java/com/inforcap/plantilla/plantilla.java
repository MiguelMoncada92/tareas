package com.inforcap.plantilla;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.util.Date;

@Controller
public class plantilla {
	@RequestMapping("/")
	public String home() {
		
		return "/index.jsp";
	}
	@RequestMapping("/date")
	public String date() {
		Date date = new Date();
		date.toString();
		return "/date.jsp";
	}
	@RequestMapping("/time")
	public String time() {
		return "/time.jsp";
	}
}

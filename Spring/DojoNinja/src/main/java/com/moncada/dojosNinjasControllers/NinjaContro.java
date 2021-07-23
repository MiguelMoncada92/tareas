package com.moncada.dojosNinjasControllers;

import org.springframework.stereotype.Controller;

import com.moncada.dojosNinjasServices.NinjaServ;

@Controller
public class NinjaContro {
	private final NinjaServ ninjaServ;
	
	public NinjaContro(NinjaServ ninjaServ) {
		this.ninjaServ = ninjaServ;
	}
	
	
	
	
	
	
}

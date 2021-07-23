package com.inforcap.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{track}")
    public String showLesson(@PathVariable("track") String track){
    	
    	if (track.equals("dojo")) {
    		return "<h1>¡El dojo es increible!</h1>";
    	}
    	else if (track.equals("burbank-dojo")) {
    		return "<h1>El Dojo Burbank está localizado al sur de California</h1>";
    	} 
    	else if (track.equals("san-jose")) {
    		return "<h1>El Dojo SJ es el cuartel general</h1>";
    	}
    	else {
    		return "<h1> Ingrese un parametro de la lista </h1> <ul><li>dojo</li><li>burbank-dojo</li><li>san-jose</li></ul>";
    	}
    	
    }
}

package com.moncada.contador;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	
	@RequestMapping("/")
	public String index(HttpSession session){
        session.setAttribute("count", 0);
        Integer count = (Integer) session.getAttribute("count");
        return "/index.jsp";
	}
	
	@RequestMapping("/counter")
	public String count(HttpSession session){
		Integer count = (Integer) session.getAttribute("count");
        return "/counter.jsp";
    }
	
}

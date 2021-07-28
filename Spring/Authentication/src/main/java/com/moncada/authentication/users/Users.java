package com.moncada.authentication.users;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moncada.authentication.models.User;
import com.moncada.authentication.services.UserService;
import com.moncada.authentication.validator.UserValidator;

@Controller
public class Users {
	private final UserService userService;
	private final UserValidator userValidator;
    
    public Users(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "/authentication/registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "/authentication/loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	userValidator.validate(user, result);
    	if (result.hasErrors()) {
    		return "/registration";
    	}
    	else {
    		
    		User user2 = userService.registerUser(user);
    		session.setAttribute ("userId", user2.getId());
    		return "redirect:/home";
    	}
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    //Si el usuario está autenticado, guarde su id de usuario en el objeto Session
    	boolean isAuthenticated = userService.authenticateUser(email, password);
    	if(isAuthenticated) {
    		User u = userService.findByEmail(email);
    		session.setAttribute("userId", u.getId());
    		return "redirect:/home";
    	} else {
    		model.addAttribute("error", "Invalid Credential. Please try again");
    		return "/authentication/loginPage.jsp";
    	}
    //sino agregue un mensaje de error y retorne a la página de inicio de sesión.
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        //Obtener el usuario desde session, guardarlo en el modelo y retornar a la página principal
    	Long userId = (Long) session.getAttribute("userId");
    	User u = userService.findUserById(userId);
    	model.addAttribute("user", u);
    	return "/authentication/homePage.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "/authentication/loginPage.jsp";
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

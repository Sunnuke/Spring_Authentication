package com.practice.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.authentication.models.User;
import com.practice.authentication.services.UserService;

@Controller
public class Users {
	
	@Autowired
    private UserService userService;
    
	// Displays Forms to Register or Login
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    // Processing routes for Registering or Logging in
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        
    }
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        
    }
    
    // Displays a success page informing the user that they are logged in
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        
    }
    
    // Closes user's session
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        
    }
}

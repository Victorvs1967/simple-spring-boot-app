package com.vvs.web.app.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	@GetMapping("/")
	public String viewIndex(Model model) {
		model.addAttribute("message", "Hello everyone, we are go to Spring Web App together.");
		model.addAttribute("date", new Date());
		return "index";
	}
}

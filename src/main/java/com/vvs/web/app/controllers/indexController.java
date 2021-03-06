package com.vvs.web.app.controllers;

import java.security.Principal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vvs.web.app.entities.Member;
import com.vvs.web.app.repositories.MemberRepository;

@Controller
public class indexController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@GetMapping("/")
	public String viewIndex(Model model, Principal principal, Member member) {

        if (principal != null) {
            model.addAttribute("message", "Hello everyone, we are go to back to Spring with together");
            model.addAttribute("date", new Date());
            model.addAttribute("members", memberRepository.getOne(principal.getName()));
        }
		return "index";
	}
}

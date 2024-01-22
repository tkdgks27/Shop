package com.cip.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HomeController {

	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("menuBar", "MenuBar");
		return "index";
	}
	@GetMapping("/join")
	public String joinPage() {
		return "join";
	}
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("menuBar", "MenuBar");
		return "login";
	}
	@PostMapping("/signin")
	public String signin(Model model) {
		model.addAttribute("menuBar", "MenuBar");
		return "index";
	}
	
}

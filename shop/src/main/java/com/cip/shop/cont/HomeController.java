package com.cip.shop.cont;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HomeController {

	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("menuBar", "MenuBar");
		model.addAttribute("result", "loginResult");
		return "index";
	}
	@GetMapping("/join")
	public String joinPage(Model model) {
		model.addAttribute("menuBar", "MenuBar");
		model.addAttribute("result", "loginResult");
		System.out.println();
		return "join";
	}
	
}

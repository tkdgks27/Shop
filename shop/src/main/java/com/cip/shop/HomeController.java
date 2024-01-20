package com.cip.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {


	@GetMapping("/")
	public String indexPage(HttpServletRequest req) {
		req.setAttribute("menuBar", "menuBar");
		req.setAttribute("Bar", "Bar");
		return "index";
	}
	@GetMapping("/join")
	public String joinPage() {
		return "join";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "lgoin";
	}
	
}

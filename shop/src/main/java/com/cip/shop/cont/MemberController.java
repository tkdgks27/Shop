package com.cip.shop.cont;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("menuBar", "MenuBar");
		model.addAttribute("result", "loginResult");
		return "login";
	}
	
	@PostMapping("/join")
	public String joinMember(Model model) {
		model.addAttribute("menuBar", "MenuBar");
		model.addAttribute("result", "loginResult");
		return "login";
	}
	
	@PostMapping("/signin")
	public String signin(Model model, @RequestParam("shop_id")String id, @RequestParam("shop_pw")String pw) {
		model.addAttribute("menuBar", "MenuBar");
		model.addAttribute("result", "loginResult");
		System.out.println(id);
		System.out.println(pw);
		return "index";
	}
	

}

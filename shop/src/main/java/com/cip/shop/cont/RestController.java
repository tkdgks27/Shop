package com.cip.shop.cont;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController {
	
	@PostMapping("/sendCode")
	public String sendCode(@RequestBody //DTO) {
		return //메일전송로직 혹은 상태코드 전송;
	}



}

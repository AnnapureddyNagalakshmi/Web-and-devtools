package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {
@GetMapping("/greet")
	@ResponseBody	//returning direct reponse to userInterface
	public String wishMsg() {
		String msg="All the Best";
		return msg;
		
	
	}
}

package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WishController {
	
	@GetMapping("/wish")
	public String getMsg(Model model) {				
		String msgTxt="Good Morning";
		model.addAttribute("msg", msgTxt);
		return "wish";				//Returning view name
	
	}
}

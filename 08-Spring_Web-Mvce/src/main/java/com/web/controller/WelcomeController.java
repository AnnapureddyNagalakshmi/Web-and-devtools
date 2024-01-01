package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public ModelAndView getWelMsg() {
		ModelAndView mrv=new ModelAndView();
		mrv.addObject("msg","Welcome to this World");
		mrv.setViewName("welcome");				//Setting view name
		return mrv;
	}
}

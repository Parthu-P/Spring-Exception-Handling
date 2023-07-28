package com.parthu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishController {

	@GetMapping("/wish")
	public String getWish(Model model) {
		model.addAttribute("msg","Good Morning");
		return "index";
	}

	@GetMapping("/greet")
	public String getGreet(Model model) {
		int a=10/0;
		model.addAttribute("msg","Good Morning");
		return "index";
	}
}

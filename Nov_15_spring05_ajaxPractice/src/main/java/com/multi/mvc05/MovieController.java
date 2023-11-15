package com.multi.mvc05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping("movie")
	public void movie(MovieVO bag, Model model) {
		model.addAttribute("bag", bag);
	}
	
}

package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public String movie(String genre) {
		String res = "";
		if(genre.equals("코믹"))
			res = "comic";
		else if(genre.equals("드라마"))
			res = "drama";
		else if(genre.equals("액션"))
			res = "action";
		else
			res = "no";
		return res;
	}
	
}

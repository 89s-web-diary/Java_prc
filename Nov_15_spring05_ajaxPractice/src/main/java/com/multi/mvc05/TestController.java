package com.multi.mvc05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("test")
	public void test() {
		 System.out.println("요청들어옴");
		// 컨트롤러 다음은 스프링에서는 무조건 views/test.jsp로 넘어감
	}
	
	@RequestMapping("test2")
	public void test2() {
		System.out.println("요청2");
	}
	
	@RequestMapping("computer")
	public void computer(ComputerVO bag, Model model) {
		model.addAttribute("bag", bag);
	}
	
}

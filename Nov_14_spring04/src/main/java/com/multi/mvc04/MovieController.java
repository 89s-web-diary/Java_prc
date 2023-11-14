package com.multi.mvc04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieDAO dao;
	
	@RequestMapping("insert")
	public String insert(MovieDTO dto) {
		int res = dao.insert(dto);
		if(res==1) return "insert";
		else return "redirect:index.jsp";
	}
	
	@RequestMapping("update")
	public String update(MovieDTO dto) {
		int res = dao.update(dto);
		if(res==1) return "update";
		else return "redirect:index.jsp";
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<MovieDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one")
	public void one(MovieDTO dto, Model model) {
		MovieDTO bag = dao.one(dto);
		model.addAttribute("bag", bag);
	}
	
}

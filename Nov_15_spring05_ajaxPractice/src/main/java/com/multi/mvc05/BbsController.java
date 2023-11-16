package com.multi.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("insertbbs")
	public String insert(BbsDTO dto,Model model) {
		int res = dao.insert(dto);
		model.addAttribute("res", res);
		return "list";
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<BbsDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one")
	public void one(BbsDTO dto, Model model) {
		BbsDTO bag = dao.one(dto);
		List<ReplyDTO> list = dao2.list(dto.getId());
		model.addAttribute("bag", bag);
		model.addAttribute("list", list);
	}
	
}

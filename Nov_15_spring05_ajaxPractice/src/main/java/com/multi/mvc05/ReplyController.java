package com.multi.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("insertreply")
	public String insert(ReplyDTO dto,Model model) {
		System.out.println(dto);
		int res = dao.insert(dto);
		List<ReplyDTO> list = dao.list(dto.getOriid());
		model.addAttribute("list", list);
		return "listRe";
	}
	
}

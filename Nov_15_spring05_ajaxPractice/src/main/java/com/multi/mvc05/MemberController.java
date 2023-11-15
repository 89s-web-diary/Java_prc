package com.multi.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("login")
	public String login(MemberDTO dto, HttpSession session) {
		int res = dao.login(dto);
		if(res==1) {
			session.setAttribute("id", dto.getId());
			return "redirect:bbs.jsp";
		}else {
			return "logFail";
		}
	}
	
	@RequestMapping("insert")
	public String insert(MemberDTO dto) {
		int res = dao.insert(dto);
		if(res==1) {
			return "insSuc";
		}else {
			return "insFail";
		}
	}
	
}

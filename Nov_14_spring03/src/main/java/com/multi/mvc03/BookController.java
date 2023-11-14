package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	// 요청하나당 함수하나!!!
	@RequestMapping("insert")
	public String insert(BookDTO dto) {
		System.out.println(dto);
		int res = dao.insert(dto);
		if(res==1) {
			System.out.println("북마크 설정 완료");
		}else {
			System.out.println("실패");
		}
		return "redirect:index.jsp";
	}
	
	@RequestMapping("update")
	public String update(BookDTO dto) {
		int res = dao.update(dto);
		if(res==1) System.out.println("수정완료");
		else System.out.println("수정실패");
		return "redirect:index.jsp";
	}
	
	@RequestMapping("one")
	public void one(BookDTO dto, Model model) {
		BookDTO bag = dao.one(dto);
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<BookDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
}

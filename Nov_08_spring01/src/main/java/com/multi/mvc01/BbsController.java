package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@RequestMapping("insert2")
	public void insert2(BbsDTO bag, Model model) {
		BbsDAO dao = new BbsDAO();
		int result = dao.insert(bag);
		if(result==1) System.out.println("작성완료");
		else System.out.println("작성실패");
		// result는 views/아래까지 가지고 가야하는 속성값으로 설정
		model.addAttribute("result", result);
	}
	
	@RequestMapping("update2")
	public String update2(BbsDTO bag) {
		BbsDAO dao = new BbsDAO();
		int res = dao.update(bag);
		if(res==1) {
			System.out.println("게시판 수정완료");
			return "redirect:bbs2.jsp?id="+bag.getId();
		}
		else {
			System.out.println("수정 실패");
			return "redirect:bbs2.jsp?id="+bag.getId();
		}
	}
	
	@RequestMapping("delete2")
	public String delete(BbsDTO bag) {
		BbsDAO dao = new BbsDAO();
		int res = dao.delete(bag);
		if(res==1) {
			System.out.println("삭제 성공");
			return "redirect:bbs.jsp";
		}else {
			System.out.println("삭제 실패");
			return "redirect:bbs.jsp";
		}
	}
	
}

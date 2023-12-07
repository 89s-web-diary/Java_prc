package com.multi.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoController {

	@Autowired
	MemoDAO dao;

	@RequestMapping("insert.memo")
	public String insert(MemoVO vo) {
		System.out.println("컨트롤러가 받은 VO >>> " + vo);
		dao.insert(vo);
		return "redirect:mongo_memo.jsp";
	}

	@RequestMapping("list.memo")
	public void list(Model model) {
		List<MemoVO> list = dao.list();
		model.addAttribute("list", list);
		System.out.println(list);
	}

	@RequestMapping("one.memo")
	public void one(String _id, Model model) {
		MemoVO vo = dao.one(_id);
		model.addAttribute("vo", vo);
	}

	@RequestMapping("delete.memo")
	public String delete(String _id) {
		dao.delete(_id);
		return "redirect:mongo_memo.jsp";
	}
	
	@RequestMapping("update.memo")
	public String update(String _id, String content) {
		MemoVO vo = new MemoVO();
		vo.set_id(_id);
		vo.setContent(content);
		dao.update(vo);
		return "redirect:mongo_memo.jsp";
	}

}

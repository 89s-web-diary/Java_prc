package com.multi.test100;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@Autowired
	PageDAO dao;
	
	@RequestMapping("list1")
	public void list1(PageVO pageVO, Model model) {
		pageVO.setStartEnd();
		List<BbsVO> list = dao.list1(pageVO);
		model.addAttribute("list", list);
	}
}

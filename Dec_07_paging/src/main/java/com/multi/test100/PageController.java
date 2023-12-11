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

	@RequestMapping("list2")
	public void list2(PageVO pageVO, Model model) {
		pageVO.setStartEnd();
		List<BbsVO> list = dao.list1(pageVO);
		// 전체 페이지 수 구하기
		int count = dao.count();
		// 모델로 views 까지 페ㅐ이지수를 넘겨야 페이지수 버튼을 만들 수 있음
		System.out.println("전체 게시물 수 >> " + count);
		int pages = (count % 10 != 0) ? (count / 10 + 1) : (count / 10);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
		model.addAttribute("list", list);
	}

	@RequestMapping("list3")
	public void list3(PageVO pageVO, Model model) {
		pageVO.setStartEnd();
		List<BbsVO> list = dao.list1(pageVO);
		// 전체 페이지 수 구하기
		int count = dao.count();
		// 모델로 views 까지 페ㅐ이지수를 넘겨야 페이지수 버튼을 만들 수 있음
		System.out.println("전체 게시물 수 >> " + count);
		int pages = (count % 10 != 0) ? (count / 10 + 1) : (count / 10);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
		model.addAttribute("list", list);
	}

	@RequestMapping("carlist")
	public void carlist(PageVO2 pageVO2, Model model) {
		pageVO2.setStartEnd();
		List<CarVO> list = dao.carlist(pageVO2);
		model.addAttribute("list", list);
	}
	 
	@RequestMapping("carlist2")
	public void carlist2(PageVO2 pageVO2, Model model) {
		pageVO2.setStartEnd();
		List<CarVO> list = dao.carlist(pageVO2);
		model.addAttribute("list", list);
		int count = dao.carCnt();
		model.addAttribute("count",count);
		int pages = (count%5!=0)?(count/5+1):(count/5);
		model.addAttribute("pages",pages);
	}
	
	@RequestMapping("carlist3")
	public void carlist3(PageVO2 pageVO2, Model model) {
		pageVO2.setStartEnd();
		List<CarVO> list = dao.carlist(pageVO2);
		model.addAttribute("list", list);
		int count = dao.carCnt();
		model.addAttribute("count",count);
		int pages = (count%5!=0)?(count/5+1):(count/5);
		model.addAttribute("pages",pages);
	}
}

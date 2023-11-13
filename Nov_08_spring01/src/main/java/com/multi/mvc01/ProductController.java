package com.multi.mvc01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO dao;
	
	@RequestMapping("insert3")
	public void insert3(ProductDTO bag) {
		int res = dao.insert(bag);
		if(res==1) System.out.println("데이터 들어감");
	}
	
	@RequestMapping("list2")
	public void list2(Model model) throws Exception {
		List<ProductDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one2")
	public void one(ProductDTO bag, Model model) throws Exception {
		ProductDTO bag2 = dao.one(bag);
		model.addAttribute("bag", bag2);
	}
	
}

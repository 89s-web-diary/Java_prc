package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("insert3")
	public void insert3(ProductDTO bag) {
		ProductDAO dao = new ProductDAO();
		int res = dao.insert(bag);
		if(res==1) System.out.println("데이터 들어감");
	}
	
}

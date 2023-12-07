package com.multi.mvc10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DictionaryController {

	@Autowired
	DictionaryService service;
	
	@RequestMapping("emotion")
	public void one(String sentence, Model model) {
		// 문장에 들어있는 명사만을 추출해서
		String res = service.emotion(sentence);
		// ==> db에 넣기 전에 전처리, db에서 검색 후 후처리는 어디서?
		// dao에게 명사를 주면서 jumsu를 mongoDB에서 검색 후 결과 요청
		model.addAttribute("result", res);
	}
	
}

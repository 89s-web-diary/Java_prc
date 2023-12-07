package com.multi.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;

@Service
public class DictionaryService {
	// 컨트롤러와 dao사이에서 전처리와 후처리를 담당하는 역할
	
	@Autowired
	DictionaryDAO dao;
	
	public String emotion(String sentence) {
		//코모란 이용해서 명사만 추출해서 플니트
		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);
		KomoranResult result = komoran.analyze(sentence);
		List<String> list = result.getNouns();
		System.out.println(list);
		int sum = 0;
		for (String s : list) {
			DictionaryVO vo = dao.one(s);
			if(vo != null) {
				System.out.println(vo.getJumsu());
				sum += vo.getJumsu();
			}
		}
		String res = "negative";
		if(sum>=0) {
			res = "positive";
		}
		return res;
	}
	
}

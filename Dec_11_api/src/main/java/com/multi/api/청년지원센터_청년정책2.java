package com.multi.api;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.client.RestTemplate;

public class 청년지원센터_청년정책2 {

	public ArrayList<YoungVO> parse() {
		// url + parameter(인증키 etc...)
		String url = "https://www.youthcenter.go.kr/opi/empList.do";
		String paramter = "?openApiVlak=2853a1265426c8954d6b244d&pageIndex=1&display=10&query=청년취업";
		
		// http 요청 >> 응답(xml)
		RestTemplate rest = new RestTemplate();
		String response = rest.getForObject(url + paramter, String.class);
		// System.out.println(response);
		
		// xml >> json변경
		JSONObject json = XML.toJSONObject(response);
		System.out.println(json);
		
		// json분석 후 데이터 추출 >> parser 클래스
		JSONObject empsInfo = json.getJSONObject("empsInfo");
		// 값이 json일 때 getJSONObject로 가져옴 ( Array일경우 getJSONArray사용 )
		JSONArray arr = empsInfo.getJSONArray("emp");
		
		ArrayList<YoungVO> list = new ArrayList<YoungVO>();
		for (int i = 0; i < arr.length(); i++) {
			YoungVO vo = new YoungVO();
			vo.setBizId(arr.getJSONObject(i).getString("bizId"));
			vo.setPolyBizSjnm(arr.getJSONObject(i).getString("polyBizSjnm"));
			vo.setPlcyTpNm(arr.getJSONObject(i).getString("plcyTpNm"));
			vo.setCnsgNmor(arr.getJSONObject(i).getString("cnsgNmor"));
			vo.setRqutProcCn(arr.getJSONObject(i).getString("rqutProcCn"));
			list.add(vo);
		}
		
		return list;
	}

}

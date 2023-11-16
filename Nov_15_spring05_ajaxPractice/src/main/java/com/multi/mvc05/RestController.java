package com.multi.mvc05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("string")
	@ResponseBody // controller에서 데이터를 리턴할 때(json) 반드시 사용
	public String name() {
		return "winner";
	}

	@RequestMapping("json1")
	@ResponseBody
	public MemberDTO json1() {
		MemberDTO bag = new MemberDTO();
		bag.setId("rrro");
		bag.setPw("1111");
		bag.setName("hyel");
		bag.setTel("111");
		return bag;
	}

	@RequestMapping("json2")
	@ResponseBody	// list<dto> >>> array[json, json]
	public ArrayList<MemberDTO> json2() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		for (int i = 0; i < 5; i++) {
			MemberDTO bag = new MemberDTO();
			bag.setId(i + "");
			bag.setPw("1111");
			bag.setName("hyel");
			bag.setTel("111");
			list.add(bag);
		}
		return list;
	}
	
	@RequestMapping("jsonmember")
	@ResponseBody
	public List<MemberDTO> jsonmember() {
		List<MemberDTO> list = dao.list();
		return list;
	}
	
	@RequestMapping("map1")
	@ResponseBody
	public MapDTO kakaoMap() {
		MapDTO map = new MapDTO();
		map.setLat(35.1689766);
		map.setLon(129.1360411);
		return map;
	}
	
}

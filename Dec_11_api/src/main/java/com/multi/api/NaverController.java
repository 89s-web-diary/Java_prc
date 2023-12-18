package com.multi.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class NaverController {
	
	@Autowired
	NaverService service;
	
	@RequestMapping("naverLogin")
	public void insert(NaverVO naverVO, Model model) {
		// 전처리해서 db처리하자
		service.insert(naverVO);
	}
	
	@RequestMapping("naverOcr")
	public void naverOcr(MultipartFile file,
						Model model, HttpServletRequest request)
						throws IOException {
		// 파일첨부한 경우에는 file이름(text) + 이미지파일자체가 전송
		
		// 1. 파일의 이름 + 파일 저장 위치를 알아와야함 >> String형식이라 컴퓨터는 인식X
		String savedName = file.getOriginalFilename();
		String uploadPath = request.getSession().getServletContext().getRealPath("resources/upload");
		System.out.println(uploadPath + "/" + savedName);
		
		// 2. 파일객체를 생성 >> 파일을 인식(램에 저장)
		File target = new File(uploadPath + "/" + savedName);
		// file객체 생성 시 추가로 실제 경로를 입력해주어야 함
		
		// 3. 서버 컴퓨터에 파일을 저장시켜야 함 >> resources아래에 저장
		file.transferTo(target);
		
		네이버_OCR2 orc2 = new 네이버_OCR2();
		String filename = uploadPath + "/" + savedName;
		ArrayList<String> list = orc2.ocr(filename);
		model.addAttribute("list", list);
		model.addAttribute("savedName", savedName);
	}
}

package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.GuestbookService;
import com.javaex.vo.GuestVo;

@Controller
public class GuestbookController {

	// 필드
	
	@Autowired
	private GuestbookService guestbookService;

	// 생성자
	// 메서드 gs

	// ---------------------------------------------------------------------------------
	// http://localhost:8888/guestbook3/list
	/* 리스트 (등록폼)*/
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("PhonebookController.list()");
		
		List<GuestVo> guestList = guestbookService.exeGetPerson();
		
		// 한다리 건너서 넣기 (데이터 보내기)
		model.addAttribute("guestList", guestList);
		
		return "addList";
		
	}
	
	
	
	
}

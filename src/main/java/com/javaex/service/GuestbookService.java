package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	
	/*  리스트 (등록폼) */
	public List<GuestVo> exeGetPerson() {
		System.out.println("GuestbookService.exeGetPerson()");
		
		List<GuestVo> guestList = guestbookDao.getPersonList();
		
		return guestList;
		
	}

}

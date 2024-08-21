package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestVo;

@Repository
public class GuestbookDao {

	@Autowired
	private SqlSession sqlSession;

	// 리스트 (등록폼)
	public List<GuestVo> getPersonList() {
			
		System.out.println("GuestbookDao.getPersonList()");
			
		List<GuestVo> personList = sqlSession.selectList("guestbook.selectList");
			
		System.out.println("===============");
		System.out.println(personList);
		System.out.println("===============");
		
		return personList;
		
	}
}

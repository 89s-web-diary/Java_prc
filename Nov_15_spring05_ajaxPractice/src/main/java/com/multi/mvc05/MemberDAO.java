package com.multi.mvc05;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int login(MemberDTO dto) {
		return my.selectOne("member.login", dto);
	}
	
	public int insert(MemberDTO dto) {
		return my.insert("member.insert",dto);
	}
	
}

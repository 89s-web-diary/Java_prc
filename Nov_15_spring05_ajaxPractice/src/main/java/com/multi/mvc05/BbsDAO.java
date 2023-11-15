package com.multi.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BbsDTO dto) {
		return my.insert("bbs.insert",dto);
	}
	
	public List<BbsDTO> list(){
		return my.selectList("bbs.list");
	}
	
	public BbsDTO one(BbsDTO dto) {
		return my.selectOne("bbs.one",dto);
	}
	
}

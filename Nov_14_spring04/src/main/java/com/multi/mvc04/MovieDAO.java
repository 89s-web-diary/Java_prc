package com.multi.mvc04;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(MovieDTO dto) {
		return my.insert("movie.create",dto);
	}
	
	public int update(MovieDTO dto) {
		return my.update("movie.update", dto);
	}
	
	public List<MovieDTO> list(){
		return my.selectList("movie.list");
	}
	
	public MovieDTO one(MovieDTO dto) {
		return my.selectOne("movie.one", dto);
	}
	
}
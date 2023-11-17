package com.multi.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MapDAO {
	
	@Autowired
	SqlSessionTemplate my;

	public MapDTO one(MapDTO dto) {
		return my.selectOne("map.one", dto);
	}
	
	public List<MapDTO> list() {
		return my.selectList("map.list");
	}
	
}

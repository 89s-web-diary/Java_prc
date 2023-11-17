package com.multi.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDAO {
	
	@Autowired
	SqlSessionTemplate my;

	public List<TaskDTO> list() {
		return my.selectList("task.list");
	}
	
}

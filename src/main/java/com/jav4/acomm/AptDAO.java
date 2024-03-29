package com.jav4.acomm;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jav4.acomm.AptVO;

@Component
public class AptDAO {
		
	@Autowired
	SqlSessionTemplate my;
	public List<AptVO> readAll() {
		return my.selectList("apt.all");
	}
	
	public AptVO readOne(AptVO vo) {
		return my.selectOne("apt.one",vo);
	}

}

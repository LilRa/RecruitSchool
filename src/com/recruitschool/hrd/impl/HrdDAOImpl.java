package com.recruitschool.hrd.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.recruitschool.hrd.model.Hrd;
import com.recruitschool.hrd.model.HrdDAO;

public class HrdDAOImpl extends SqlSessionDaoSupport implements HrdDAO {

	@Override
	public List hrdSelectAll() {
		// TODO Auto-generated method stub
		List list = getSqlSession().selectList("Hrd.selectAll");
		return list;
	}

	@Override
	public int hrdInsertAll(List<Hrd> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}

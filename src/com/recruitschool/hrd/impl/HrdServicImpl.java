package com.recruitschool.hrd.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recruitschool.hrd.model.Hrd;
import com.recruitschool.hrd.model.HrdDAO;
import com.recruitschool.hrd.model.HrdService;

@Service
public class HrdServicImpl implements HrdService{
	private HrdDAO hrdDAO;
	

	public void setHrdDAO(HrdDAO hrdDAO) {
		this.hrdDAO = hrdDAO;
	}

	@Override
	public List hrdSelectAll() {
		// TODO Auto-generated method stub
		List list = hrdDAO.hrdSelectAll();
		return list;
	}

	@Override
	public int hrdInsertAll(List<Hrd> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}

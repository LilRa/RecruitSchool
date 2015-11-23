package com.recruitschool.hrd.model;

import java.util.List;

public interface HrdDAO {

	public List hrdSelectAll();
	public int hrdInsertAll(List<Hrd> list);
	

}

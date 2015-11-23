package com.recruitschool.hrd.model;

import java.util.List;

public interface HrdService {
	
	public List hrdSelectAll();
	public int hrdInsertAll(List<Hrd> list);
}

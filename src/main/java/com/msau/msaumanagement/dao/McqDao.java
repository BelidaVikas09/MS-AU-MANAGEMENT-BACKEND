package com.msau.msaumanagement.dao;

import java.util.List;

import com.msau.msaumanagement.models.Mcq;

public interface McqDao {
	   public List<Mcq> getAllMcq();
	   public List<Mcq> getAllMcq(String name);
	   public boolean deleteMcqById(int id);
	   public int addMcq(Mcq Mcq);
	   public Mcq updateMcq(Mcq Mcq);
}

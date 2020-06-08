package com.msau.msaumanagement.services;

import java.util.List;

import com.msau.msaumanagement.models.Mcq;

public interface McqServiceInter {
	   public List<Mcq> getAllMcq();
	   public List<Mcq> getAllMcq(String name);
	   public boolean deleteMcqById(int id);
	   public int addMcq(Mcq Mcq);
	   public Mcq updateMcq(Mcq Mcq);
}

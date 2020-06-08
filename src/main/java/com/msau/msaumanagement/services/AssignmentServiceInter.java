package com.msau.msaumanagement.services;

import java.util.List;

import com.msau.msaumanagement.models.Assignment;

public interface AssignmentServiceInter {
	   public List<Assignment> getAllAssignment();
	   public List<Assignment> getAllAssignment(String name);
	   public boolean deleteAssignmentById(int id);
	   public int addAssignment(Assignment Assignment);
	   public Assignment updateAssignment(Assignment Assignment);
}

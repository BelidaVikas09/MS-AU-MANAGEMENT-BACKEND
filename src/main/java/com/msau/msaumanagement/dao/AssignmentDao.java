package com.msau.msaumanagement.dao;

import java.util.List;

import com.msau.msaumanagement.models.Assignment;

public interface AssignmentDao {
	   public List<Assignment> getAllAssignment();
	   public List<Assignment> getAllAssignment(String name);
	   public boolean deleteAssignmentById(int id);
	   public int addAssignment(Assignment Assignment);
	   public Assignment updateAssignment(Assignment Assignment);
}

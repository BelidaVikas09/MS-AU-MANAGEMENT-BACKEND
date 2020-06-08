package com.msau.msaumanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msau.msaumanagement.dao.AssignmentDao;
import com.msau.msaumanagement.models.Assignment;

@Service
public class AssignmentService implements AssignmentServiceInter {
    @Autowired
    private AssignmentDao assignmentdao;
	@Override
	public List<Assignment> getAllAssignment() {
		return assignmentdao.getAllAssignment();
	}

	@Override
	public boolean deleteAssignmentById(int id) {
		return assignmentdao.deleteAssignmentById(id);
	}

	@Override
	public int addAssignment(Assignment Assignment) {
		return assignmentdao.addAssignment(Assignment);
	}

	@Override
	public Assignment updateAssignment(Assignment Assignment) {
		return assignmentdao.updateAssignment(Assignment);
	}

	@Override
	public List<Assignment> getAllAssignment(String name) {
		return assignmentdao.getAllAssignment(name);
	}

}

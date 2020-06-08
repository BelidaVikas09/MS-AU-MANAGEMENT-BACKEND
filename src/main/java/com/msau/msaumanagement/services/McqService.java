package com.msau.msaumanagement.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msau.msaumanagement.dao.McqDaoImpl;
import com.msau.msaumanagement.models.Mcq;

@Service
public class McqService implements McqServiceInter{

	@Autowired
	private McqDaoImpl mcqdaoimpl;
	@Override
	public List<Mcq> getAllMcq() {
		return mcqdaoimpl.getAllMcq();
	}

	@Override
	public boolean deleteMcqById(int id) {
		return mcqdaoimpl.deleteMcqById(id);
	}

	@Override
	public int addMcq(Mcq Mcq) {
		return mcqdaoimpl.addMcq(Mcq);
	}

	@Override
	public Mcq updateMcq(Mcq Mcq) {
		return mcqdaoimpl.updateMcq(Mcq);
	}

	@Override
	public List<Mcq> getAllMcq(String name) {
		return mcqdaoimpl.getAllMcq(name);
	}

}

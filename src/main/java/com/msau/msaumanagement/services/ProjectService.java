package com.msau.msaumanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.msau.msaumanagement.dao.ProjectDao;
import com.msau.msaumanagement.models.Project;
@Service
public class ProjectService implements ProjectServiceInter {
@Autowired
private ProjectDao projdao;
	@Override
	public List<Project> getAllProject() {
		return projdao.getAllProject();
	}

	@Override
	public boolean deleteProjectById(int id) {
		return projdao.deleteProjectById(id);
	}
	@Override
	public int addProject(Project Project) {
		return projdao.addProject(Project);
	}

	@Override
	public Project updateProject(Project Project) {
		return projdao.updateProject(Project);
	}

	@Override
	public List<Project> getAllProject(String name) {
		return projdao.getAllProject(name);
	}

}

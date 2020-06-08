package com.msau.msaumanagement.services;

import java.util.List;

import com.msau.msaumanagement.models.Project;

public interface ProjectServiceInter {
	   public List<Project> getAllProject();
	   public List<Project> getAllProject(String name);
	   public boolean deleteProjectById(int id);
	   public int addProject(Project Project);
	   public Project updateProject(Project Project);
}

package com.msau.msaumanagement.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.msau.msaumanagement.models.ProjectRowMapper;
import com.msau.msaumanagement.models.Project;
@Transactional
@Repository

public class ProjectDaoImpl implements ProjectDao{
	
	@Autowired
	 private JdbcTemplate jdbcTemplate;

	@Override
	public List<Project> getAllProject() {
		  String Query="select * from Project";
		   RowMapper<Project> rowMapper = new ProjectRowMapper();
		   List <Project>project = jdbcTemplate.query(Query, rowMapper);
		   return project;
	}

	@Override
	public boolean deleteProjectById(int id) {
		  String Query="delete from Project where id="+id;
	      return jdbcTemplate.update(Query)>0;
	}

	@Override
	public int addProject(Project Project) {
		String query="select * from Project where candidatename='"+Project.getCandidatename()+"' and projname= '"+ Project.getProjname()+"'";
		List<Project> proj = jdbcTemplate.query(query, new ProjectRowMapper());
		 if(!proj.isEmpty()){
			   System.out.println(proj.get(0).getId());
			   return -1;
		   }
        String Query="insert into Project (projname,candidatename,trainer,buildmarks,testingmarks,processmarks,location,year,course) values (?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(Query,Project.getProjname(),Project.getCandidatename(),Project.getTrainer(),Project.getBuildmarks(),Project.getTestingmarks(),Project.getProcessmarks(),Project.getLocation(),Project.getYear(),Project.getCourse());
		return Project.getId();
	}

	@Override
	public Project updateProject(Project Project) {
		 String query="update Project set projname=?,candidatename=?,trainer=?, buildmarks=?, testingmarks=?,processmarks=?,location=?, year=?, course=? where id=?";
		 jdbcTemplate.update(query,Project.getProjname(),Project.getCandidatename(),Project.getTrainer(),Project.getBuildmarks(),Project.getTestingmarks(),Project.getProcessmarks(),Project.getLocation(),Project.getYear(),Project.getCourse(),Project.getId());
		 return Project;
	}

	@Override
	public List<Project> getAllProject(String name) {
		   String Query="select * from Project where candidatename='"+name+"'";
		   RowMapper<Project> rowMapper = new ProjectRowMapper();
		   List <Project>project = jdbcTemplate.query(Query, rowMapper);
		   return project;
	}
  
}

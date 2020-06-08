package com.msau.msaumanagement.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProjectRowMapper implements RowMapper<Project>{
	@Override
	 public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
	    Project Project=new Project();
	    Project.setCandidatename(rs.getString("candidatename"));
	    Project.setCourse(rs.getString("course"));
	    Project.setId(rs.getInt("id"));
	    Project.setLocation(rs.getString("location"));
	    Project.setBuildmarks(rs.getInt("buildmarks"));
	    Project.setTestingmarks(rs.getInt("testingmarks"));
	    Project.setProcessmarks(rs.getInt("processmarks"));
	    Project.setProjname(rs.getString("projname"));
	    Project.setTrainer(rs.getString("trainer"));
	    Project.setYear(rs.getInt("year"));
	    return Project;
	 }
}

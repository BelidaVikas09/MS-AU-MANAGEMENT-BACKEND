package com.msau.msaumanagement.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AssignmentRowMapper implements RowMapper<Assignment>{
	@Override
	 public Assignment mapRow(ResultSet rs, int rowNum) throws SQLException {
	    Assignment assignment=new Assignment();
	    assignment.setCandidatename(rs.getString("candidatename"));
	    assignment.setCourse(rs.getString("course"));
	    assignment.setId(rs.getInt("id"));
	    assignment.setLocation(rs.getString("location"));
	    assignment.setMarks(rs.getInt("marks"));
	    assignment.setAssignmentname(rs.getString("assignmentname"));
	    assignment.setTrainer(rs.getString("trainer"));
	    assignment.setYear(rs.getInt("year"));
	    return assignment;
	 }
}

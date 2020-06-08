package com.msau.msaumanagement.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class McqRowMapper implements RowMapper<Mcq>{
	@Override
	 public Mcq mapRow(ResultSet rs, int rowNum) throws SQLException {
	    Mcq mcq=new Mcq();
	    mcq.setCandidatename(rs.getString("candidatename"));
	    mcq.setCourse(rs.getString("course"));
	    mcq.setId(rs.getInt("id"));
	    mcq.setLocation(rs.getString("location"));
	    mcq.setMarks(rs.getInt("marks"));
	    mcq.setMcqname(rs.getString("mcqname"));
	    mcq.setTrainer(rs.getString("trainer"));
	    mcq.setYear(rs.getInt("year"));
	    return mcq;
	 }
}

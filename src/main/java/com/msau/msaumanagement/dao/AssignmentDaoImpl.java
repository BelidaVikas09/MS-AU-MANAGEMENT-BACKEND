package com.msau.msaumanagement.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.msau.msaumanagement.models.AssignmentRowMapper;
import com.msau.msaumanagement.models.Assignment;
  
@Transactional
@Repository
public class AssignmentDaoImpl implements AssignmentDao{
	@Autowired
	 private JdbcTemplate jdbcTemplate;

	@Override
	public List<Assignment> getAllAssignment() {
		   String Query="select * from Assignment";
		   RowMapper<Assignment> rowMapper = new AssignmentRowMapper();
		   List <Assignment>assignment = jdbcTemplate.query(Query, rowMapper);
		   return assignment;
	}

	@Override
	public boolean deleteAssignmentById(int id){
		 String Query="delete from Assignment where id="+id;
	      return jdbcTemplate.update(Query)>0;
	}

	@Override
	public int addAssignment(Assignment Assignment) {
		String query="select * from Assignment where candidatename='"+Assignment.getCandidatename()+"' and Assignmentname= '"+ Assignment.getAssignmentname()+"'";
		List<Assignment> assignment = jdbcTemplate.query(query, new AssignmentRowMapper());
		 if(!assignment.isEmpty()){
			   System.out.println(assignment.get(0).getId());
			   return -1;  
		   }
        String Query="insert into Assignment (assignmentname,candidatename,trainer,marks,location,year,course) values (?,?,?,?,?,?,?)";
        jdbcTemplate.update(Query,Assignment.getAssignmentname(),Assignment.getCandidatename(),Assignment.getTrainer(),Assignment.getMarks(),Assignment.getLocation(),Assignment.getYear(),Assignment.getCourse());
		return Assignment.getId();
	}

	@Override
	public Assignment updateAssignment(Assignment Assignment) {
		  String query="update Assignment set assignmentname=?,candidatename=?,trainer=?, marks=?, location=?, year=?, course=? where id=?";
		 jdbcTemplate.update(query,Assignment.getAssignmentname(),Assignment.getCandidatename(),Assignment.getTrainer(),Assignment.getMarks(),Assignment.getLocation(),Assignment.getYear(),Assignment.getCourse(),Assignment.getId());
		 return Assignment;
	}

	@Override
	public List<Assignment> getAllAssignment(String name) {
		   String Query="select * from Assignment where candidatename='"+name+"'";
		   RowMapper<Assignment> rowMapper = new AssignmentRowMapper();
		   List <Assignment>assignment = jdbcTemplate.query(Query, rowMapper);
		   return assignment;
	}

}

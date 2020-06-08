package com.msau.msaumanagement.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.msau.msaumanagement.models.McqRowMapper;
import com.msau.msaumanagement.models.Mcq;

@Transactional
@Repository

public class McqDaoImpl implements McqDao{
	@Autowired
	 private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Mcq> getAllMcq() {
		   String Query="select * from Mcq";
		   RowMapper<Mcq> rowMapper = new McqRowMapper();
		   List <Mcq>mcq = jdbcTemplate.query(Query, rowMapper);
		   return mcq;
	}

	@Override
	public boolean deleteMcqById(int id) {
		  String Query="delete from Mcq where id="+id;
	      return jdbcTemplate.update(Query)>0;
	}

	@Override
	public int addMcq(Mcq Mcq) {

		String query="select * from Mcq where candidatename='"+Mcq.getCandidatename()+"' and Mcqname= '"+ Mcq.getMcqname()+"'";
		List<Mcq> Mc = jdbcTemplate.query(query, new McqRowMapper());
		 if(!Mc.isEmpty()){
			   System.out.println(Mc.get(0).getId());
			   return -1;
		   }
        String Query="insert into Mcq (Mcqname,candidatename,trainer,marks,location,year,course) values (?,?,?,?,?,?,?)";
        jdbcTemplate.update(Query,Mcq.getMcqname(),Mcq.getCandidatename(),Mcq.getTrainer(),Mcq.getMarks(),Mcq.getLocation(),Mcq.getYear(),Mcq.getCourse());
		return Mcq.getId();
	}

	@Override
	public Mcq updateMcq(Mcq Mcq) {
		 String query="update Mcq set Mcqname=?,candidatename=?,trainer=?, marks=?, location=?, year=?, course=? where id=?";
		 jdbcTemplate.update(query,Mcq.getMcqname(),Mcq.getCandidatename(),Mcq.getTrainer(),Mcq.getMarks(),Mcq.getLocation(),Mcq.getYear(),Mcq.getCourse(),Mcq.getId());
		 return Mcq;
	}

	@Override
	public List<Mcq> getAllMcq(String name) {
		   String Query="select * from Mcq where candidatename='"+name+"'";
		   RowMapper<Mcq> rowMapper = new McqRowMapper();
		   List <Mcq>mcq = jdbcTemplate.query(Query, rowMapper);
		   return mcq;	
   }

}

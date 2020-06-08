package com.msau.msaumanagement.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class QuizRowMapper implements RowMapper<Quiz>{
	@Override
	 public Quiz mapRow(ResultSet rs, int rowNum) throws SQLException {
	    Quiz quiz=new Quiz();
	    quiz.setCandidatename(rs.getString("candidatename"));
	    quiz.setCourse(rs.getString("course"));
	    quiz.setId(rs.getInt("id"));
	    quiz.setLocation(rs.getString("location"));
	    quiz.setMarks(rs.getInt("marks"));
	    quiz.setQuizname(rs.getString("quizname"));
	    quiz.setTrainer(rs.getString("trainer"));
	    quiz.setYear(rs.getInt("year"));
	    return quiz;
	 }
}

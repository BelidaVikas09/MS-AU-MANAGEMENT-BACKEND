package com.msau.msaumanagement.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.msau.msaumanagement.models.Quiz;
import com.msau.msaumanagement.models.QuizRowMapper;

@Transactional
@Repository
public class QuizDaoImpl implements QuizDao{
	@Autowired
	 private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Quiz> getAllQuiz() {
		   String Query="select * from Quiz";
		   RowMapper<Quiz> rowMapper = new QuizRowMapper();
		   List <Quiz>quiz = jdbcTemplate.query(Query, rowMapper);
		   return quiz;
	}

	@Override
	public boolean deleteQuizById(int id) {
        String Query="delete from Quiz where id="+id;
        return jdbcTemplate.update(Query)>0;

	}

	@Override
	public int addQuiz(Quiz quiz) {
		String query="select * from Quiz where candidatename='"+quiz.getCandidatename()+"' and quizname= '"+ quiz.getQuizname()+"'";
		List<Quiz> quz = jdbcTemplate.query(query, new QuizRowMapper());
		 if(!quz.isEmpty()){
			   System.out.println(quz.get(0).getId());
			   return -1;
		   }
        String Query="insert into Quiz (quizname,candidatename,trainer,marks,location,year,course) values (?,?,?,?,?,?,?)";
        jdbcTemplate.update(Query,quiz.getQuizname(),quiz.getCandidatename(),quiz.getTrainer(),quiz.getMarks(),quiz.getLocation(),quiz.getYear(),quiz.getCourse());
		return quiz.getId();
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
	    String query="update Quiz set quizname=?,candidatename=?,trainer=?, marks=?, location=?, year=?, course=? where id=?";
		jdbcTemplate.update(query,quiz.getQuizname(),quiz.getCandidatename(),quiz.getTrainer(),quiz.getMarks(),quiz.getLocation(),quiz.getYear(),quiz.getCourse(),quiz.getId());
	    return quiz;
	}

	@Override
	public List<Quiz> getAllQuiz(String name) {
		   String Query="select * from Quiz where candidatename='"+name+"'";
		   RowMapper<Quiz> rowMapper = new QuizRowMapper();
		   List <Quiz>quiz = jdbcTemplate.query(Query, rowMapper);
		   return quiz;
	}

}

package com.msau.msaumanagement.services;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  
import com.msau.msaumanagement.models.Quiz;
import com.msau.msaumanagement.dao.QuizDaoImpl;
@Service
public class QuizService implements QuizServiceInter {

	@Autowired
	private QuizDaoImpl quizdaoimpl;
	
	 @Override
	public List<Quiz> getAllQuiz() {
		return quizdaoimpl.getAllQuiz();
	}

	@Override
	public boolean deleteQuizById(int id) {
		return quizdaoimpl.deleteQuizById(id);
	}

	@Override
	public int addQuiz(Quiz quiz) {
		return quizdaoimpl.addQuiz(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		return quizdaoimpl.updateQuiz(quiz);
	}

	@Override
	public List<Quiz> getAllQuiz(String name) {
		return quizdaoimpl.getAllQuiz(name);
	}
   
}

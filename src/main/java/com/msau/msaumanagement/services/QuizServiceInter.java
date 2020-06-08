package com.msau.msaumanagement.services;

import java.util.List;

import com.msau.msaumanagement.models.Quiz;

public interface QuizServiceInter {
	 public List<Quiz> getAllQuiz();
	 public List<Quiz> getAllQuiz(String name);
	   public boolean deleteQuizById(int id);
	   public int addQuiz(Quiz quiz);
	   public Quiz updateQuiz(Quiz quiz);
}

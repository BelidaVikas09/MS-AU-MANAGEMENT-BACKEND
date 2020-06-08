package com.msau.msaumanagement.controllers;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController; 
import com.msau.msaumanagement.models.Quiz;
import com.msau.msaumanagement.services.QuizService;
@RestController  
public class QuizController {
	@Autowired  
	QuizService quizservice;
	@GetMapping("/msau/quiz")
	public List<Quiz> getAllQuiz(){
		 return quizservice.getAllQuiz();
	}
	@GetMapping("/msau/quiz/{name}")
	public List<Quiz> getAllQuiz(@PathVariable("name") String name){
		 return quizservice.getAllQuiz(name);
	}
	@DeleteMapping("/msau/delquiz/{quizid}")
	public boolean deleteQuizById(@PathVariable("quizid") int id) {
		   return quizservice.deleteQuizById(id);
	}
	@PostMapping("/msau/addquiz")  
	public int addQuiz(@RequestBody  Quiz quiz) {
		   return quizservice.addQuiz(quiz);
	}
	@PutMapping("/msau/updatequiz")
	public Quiz updateQuiz(@RequestBody  Quiz quiz) {
		   return quizservice.updateQuiz(quiz);
	}
}

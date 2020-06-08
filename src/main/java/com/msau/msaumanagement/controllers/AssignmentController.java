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
import com.msau.msaumanagement.models.Assignment;
import com.msau.msaumanagement.services.AssignmentService;
@RestController  
public class AssignmentController {
	@Autowired
	private AssignmentService Assignmentservice;
	@GetMapping("/msau/assignment")
	public List<Assignment> getAllAssignment(){
		 return Assignmentservice.getAllAssignment();
	}
	@GetMapping("/msau/assignment/{name}")
	public List<Assignment> getAllAssignment(@PathVariable("name") String name){
		 return Assignmentservice.getAllAssignment(name);
	}
	@DeleteMapping("/msau/delassignment/{Assignmentid}")
	public boolean deleteAssignmentById(@PathVariable("Assignmentid") int id) {
		   return Assignmentservice.deleteAssignmentById(id);
	}
	@PostMapping("/msau/addassignment")  
	public int addAssignment(@RequestBody  Assignment Assignment) {
		   return Assignmentservice.addAssignment(Assignment);
	}
	@PutMapping("/msau/updateassignment")
	public Assignment updateAssignment(@RequestBody  Assignment Assignment) {
		   return Assignmentservice.updateAssignment(Assignment);
	}
}

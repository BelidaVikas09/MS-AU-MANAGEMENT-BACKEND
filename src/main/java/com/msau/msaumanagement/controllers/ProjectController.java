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
import com.msau.msaumanagement.models.Project;
import com.msau.msaumanagement.services.ProjectService;
@RestController  
public class ProjectController {
   @Autowired 
   private ProjectService Projectservice;
   @GetMapping("/msau/Project")
	public List<Project> getAllProject(){
		 return Projectservice.getAllProject();
	}
   @GetMapping("/msau/Project/{name}")
	public List<Project> getAllProject(@PathVariable("name") String name){
		 return Projectservice.getAllProject(name);
	}
	@DeleteMapping("/msau/delProject/{Projectid}")
	public boolean deleteProjectById(@PathVariable("Projectid") int id) {
		   return Projectservice.deleteProjectById(id);
	}
	@PostMapping("/msau/addProject")  
	public int addProject(@RequestBody  Project Project) {
		   return Projectservice.addProject(Project);
	}
	@PutMapping("/msau/updateProject")
	public Project updateProject(@RequestBody  Project Project) {
		   return Projectservice.updateProject(Project);
	}
}

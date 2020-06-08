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
import com.msau.msaumanagement.models.Mcq;
import com.msau.msaumanagement.services.McqService;
@RestController  
public class McqController {
	@Autowired  
	McqService mcqservice;
	@GetMapping("/msau/mcq")
	public List<Mcq> getAllMcq(){
		 return mcqservice.getAllMcq();
	}
	@GetMapping("/msau/mcq/{name}")
	public List<Mcq> getAllMcq(@PathVariable("name") String name){
		 return mcqservice.getAllMcq(name);
	}
	@DeleteMapping("/msau/delmcq/{mcqid}")
	public boolean deleteMcqById(@PathVariable("mcqid") int id) {
		   return mcqservice.deleteMcqById(id);
	}
	@PostMapping("/msau/addmcq")  
	public int addmcq(@RequestBody  Mcq mcq) {
		   return mcqservice.addMcq(mcq);
	}
	@PutMapping("/msau/updatemcq")
	public Mcq updatemcq(@RequestBody  Mcq mcq) {
		   return mcqservice.updateMcq(mcq);
	}
}

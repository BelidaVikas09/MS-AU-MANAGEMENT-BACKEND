package com.msau.msaumanagement.controllers;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController; 
import com.msau.msaumanagement.models.User;
import com.msau.msaumanagement.services.UserService;
@RestController  
public class UserController {
	@Autowired  
	UserService userservice;
	@GetMapping("/msau/user")
	private List<User> getAllUsers()   
	{  
	return userservice.getAllUsers();  
	}  
	@GetMapping("/msau/user/{userid}")  
	private User getUser(@PathVariable("userid") int userid)   
	{  
	 return userservice.getUserById(userid); 
	}
	@PostMapping("/msau/user")  
	private int saveUser(@RequestBody User user)   
	{  
	return userservice.addUser(user);  		
	}  
	@PutMapping("/msau/user")  
	private User update(@RequestBody User user)   
	{  
        userservice.updateUser(user);
		return user;  
	}  
}	

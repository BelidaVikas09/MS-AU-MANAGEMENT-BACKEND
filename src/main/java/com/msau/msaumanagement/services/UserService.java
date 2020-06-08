package com.msau.msaumanagement.services;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  
import com.msau.msaumanagement.models.User;
import com.msau.msaumanagement.dao.UserDaoImpl;
@Service  
public class UserService implements UserServiceInter {

	 @Autowired
	 private UserDaoImpl userdaoimpl;
	 
	 @Override
	   public List<User> getAllUsers(){
		   return userdaoimpl.getAllUsers();
	   }
	   @Override
	   public User getUserById(int id) {
		  return userdaoimpl.getUserById(id);
	   }
	   @Override
	   public int addUser(User user) {
		  return userdaoimpl.addUser(user);
	   }
	   @Override
	   public User updateUser(User user) {
		   return userdaoimpl.updateUser(user);
	   }
  
	
}

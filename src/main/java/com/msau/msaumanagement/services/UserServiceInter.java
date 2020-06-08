package com.msau.msaumanagement.services;
import java.util.List;
import com.msau.msaumanagement.models.User;

public interface UserServiceInter {
	  public List<User> getAllUsers();
	   public User getUserById(int id);
	   public int addUser(User user);
	   public User updateUser(User user);
}

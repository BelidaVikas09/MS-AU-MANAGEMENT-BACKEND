package com.msau.msaumanagement.dao;
import java.util.List;
import com.msau.msaumanagement.models.*;
public interface UserDao {
   public List<User> getAllUsers();
   public User getUserById(int id);
   public int addUser(User user);
   public User updateUser(User user);
}

package com.msau.msaumanagement.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.msau.msaumanagement.models.User;
import com.msau.msaumanagement.models.UserRowMapper;
@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	 private JdbcTemplate jdbcTemplate;
	   @Override
	   public List<User> getAllUsers(){
		   String Query="select * from User";
		   RowMapper<User> rowMapper = new UserRowMapper();
		   List <User>user = jdbcTemplate.query(Query, rowMapper);
		   return user;
	   }
	   @Override
	   public User getUserById(int id) {
		   String query="select * from User where id=?";
		   RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		   User user = jdbcTemplate.queryForObject(query, rowMapper, id);
		   return user;
	   }
	   @Override
	   public int addUser(User user) {
		   String query="select * from User where email='"+user.getEmail()+"'";
		   List<User> usr = jdbcTemplate.query(query, new UserRowMapper());
		   if(!usr.isEmpty()){
			   System.out.println(usr.get(0).getId());
			   return -1;
		   }
		   System.out.println("hiii");
		   String query1= "insert into User (name,profilepic,email) values (?,?,?)";
		   jdbcTemplate.update(query1,user.getName(),user.getProfilepic(),user.getEmail());
		   return user.getId();
	   }
	   @Override
	   public User updateUser(User user) {
		    String query="update User set name=?,profilepic=?,email=? where id=?";
		    jdbcTemplate.update(query,user.getName(),user.getProfilepic(),user.getEmail(),user.getId());
		    return user;
	   }
}

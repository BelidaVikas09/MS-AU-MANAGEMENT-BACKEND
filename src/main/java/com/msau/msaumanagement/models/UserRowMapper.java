package com.msau.msaumanagement.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{
	@Override
	 public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	    User user=new User();
	    user.setId(rs.getInt("id"));
	    user.setName(rs.getString("name"));
	    user.setProfilepic(rs.getString("profilepic"));
	    user.setEmail(rs.getString("email"));
	    return user;
	 }
}

package com.kitty.onlinshoppingapp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.kitty.onlinshoppingapp.model.User;

//user data access object
public class UserDao {
	private Connection conn;
	
	public UserDao(Connection conn) {
		this.conn = conn;
	}
	
	public User findById(int id) throws SQLException{
		User user = null;
		PreparedStatement pstmt = conn.prepareStatement("select id, name, password from user where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPassword(rs.getString(3));
		}
		
		return user;
	}
	
	public User findByName(String match) throws SQLException{
		User user = null;
		PreparedStatement pstmt = conn.prepareStatement("select id, name, password from user where name = ?");
		pstmt.setString(1, match);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPassword(rs.getString(3));
		}
		
		return user;
	}
	
	public static void main(String[] args) throws SQLException{
		try (Connection con = DatabaseConnection.getDatabaseConnection()) {
			UserDao userDao = new UserDao(con);
			User user = userDao.findById(2);
			System.out.println(user);
			
			System.out.println("Find name matches xxx: ");
			User name = userDao.findByName("xxx");
			System.out.println(name);
		}
	}

}

package com.kitty.onlinshoppingapp.dao;

import com.kitty.onlinshoppingapp.model.Product;
import com.kitty.onlinshoppingapp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {
	private Connection conn;
	
	public ProductDao(Connection conn) {
		this.conn = conn;
	}
	
	public Product findById(int id) throws SQLException{
		Product product = null;
		PreparedStatement pstmt = conn.prepareStatement("select id, price, name, description from user where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
		
			product.setId(rs.getInt(1));
			product.setPrice(rs.getDouble(2));
			product.setName(rs.getString(3));
			product.setDescription(rs.getString(4));
		}
		
		return product;
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
	
	
}

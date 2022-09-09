package com.kitty.onlinshoppingapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kitty.onlinshoppingapp.model.Order;
import com.kitty.onlinshoppingapp.model.Product;
import com.kitty.onlinshoppingapp.model.User;


public class OrderDao {
	private Connection conn;
	private ProductDao productDao;
	private UserDao userDao;
	
	public Order findById(int id) throws SQLException{
		Order order = null;
		PreparedStatement pstmt = conn.prepareStatement("select id, user id, product id from order where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			order.setId(rs.getInt(1));
			
			int userId = rs.getInt(2);
			User user = userDao.findById(userId);
			order.setUserId(userId);
			
			int productId = rs.getInt(3);
			Product product = productDao.findById(productId);
		}
		return order;
	}
}


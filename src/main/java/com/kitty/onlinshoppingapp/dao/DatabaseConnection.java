package com.kitty.onlinshoppingapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    public static Connection getDatabaseConnection() throws SQLException{
        if (connection == null) {
            //initialize connection here
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/KittyKi", "root", "abcd1234.");
        }
        return connection;
    }

    public static void main(String args) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        System.out.println(con.getCatalog());
        con.close();
    }
}

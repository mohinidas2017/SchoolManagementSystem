package com.gcect.SMS.DBUtil;


import java.sql.*;

public class DBManager {
	Connection conn = null;
	public Connection getConnection()
	{
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
			        "postgres", "mohini");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	

}

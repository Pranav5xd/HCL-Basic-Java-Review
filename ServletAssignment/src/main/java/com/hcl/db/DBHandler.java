package com.hcl.db;

import java.sql.*;

import com.hcl.User;

public class DBHandler {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/EmployeeDB?useSSL=false";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "846735";

	private static String validateCommand = "SELECT UID FROM USERS WHERE USERNAME = ? AND PASSWORD = ?;";
	private static String registerCommand = "INSERT INTO USERS (USERNAME, PASSWORD) VALUES (?,?);";

	Connection connection;

	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return connection;
	}

	public static boolean validate(User user) throws ClassNotFoundException {
		boolean valid = false;

		try (Connection c = DBHandler.getConnection();
				PreparedStatement ps = c.prepareStatement(validateCommand);) {
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			valid = rs.next();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return valid;
	}
	
	public static int register(User user) throws ClassNotFoundException{
		int valid = 0;
		try (Connection c = DBHandler.getConnection();
				PreparedStatement ps = c.prepareStatement(registerCommand);) {
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			valid = ps.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return valid;
	}
}

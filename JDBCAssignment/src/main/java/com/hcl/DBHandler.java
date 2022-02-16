package com.hcl;

import java.sql.*;

public class DBHandler {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/EmployeeDB?useSSL=false";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "846735";

	Connection connection;

	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return connection;
	}

	public String createTable() {
		try {
			String create = "CREATE TABLE IF NOT EXISTS EmployeeDB(" + "EmpID int(11) NOT NULL AUTO_INCREMENT,"
					+ "EmpName VARCHAR(45)," + "DOB DATE," + "Salary int(11)," + "Age int(11)," + "PRIMARY KEY (EmpID)"
					+ ");";

			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			Statement statement = connection.createStatement();
			statement.execute(create);
			return "OK";
		} catch (SQLException e) {
			return e.toString();
		}
	}
	

	public void insertRecord(Employee emp) {
		try {
			String insert = "INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES " + " (?, ?, ?, ?);";

			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setString(1, emp.getName());
			preparedStatement.setDate(2, (Date) emp.getDOB());
			preparedStatement.setDouble(3, emp.getSalary());
			preparedStatement.setInt(4, emp.getAge());
			preparedStatement.executeUpdate();
			System.out.print("Record inserted");
		} catch (SQLException e) {
			System.out.print("Record insert failed");
		}
	}

	public void updateRecord(String colNVal, String condition) {
		try {
			String update = "UPDATE Employee SET ";
			PreparedStatement preparedStatement = connection.prepareStatement(update + colNVal + " WHERE " + condition);
			preparedStatement.executeUpdate();
			System.out.print("Record updated");
		} catch (SQLException e) {
			System.out.println("Record update failed");
		}
	}

	public void deleteRecord(String condition) {
		try {
			String delete = "DELETE FROM Employee WHERE ";
			PreparedStatement preparedStatement = connection.prepareStatement(delete + condition);
			preparedStatement.executeUpdate();
			System.out.print("Record deleted");
		} catch (SQLException e) {
			System.out.print("Record deleted failed");
		}
	}

	public void showAll() {
		try {
			String query = "SELECT * FROM Employee";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("EmpID");
				String name = rs.getString("EmpName");
				String dob = rs.getDate("DOB").toLocalDate().toString();
				String salary = Double.toString(rs.getDouble("Salary"));
				String age = rs.getString("Age");
				System.out.println(id + " " + name + " " + dob + "	" + salary + " " + age);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void selectRecord(String condition) {
		try {
			String query = "SELECT * FROM Employee WHERE ";
			PreparedStatement preparedStatement = connection.prepareStatement(query + condition);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("EmpID");
				String name = rs.getString("EmpName");
				String dob = rs.getDate("DOB").toLocalDate().toString();
				String salary = Double.toString(rs.getDouble("Salary"));
				String age = rs.getString("Age");
				System.out.println(id + " " + name + " " + dob + "	" + salary + " " + age);
			}
			
			System.out.print("Record shown");
		} catch (SQLException e) {
			System.out.println(e);
		}
		System.out.println();
	}
}

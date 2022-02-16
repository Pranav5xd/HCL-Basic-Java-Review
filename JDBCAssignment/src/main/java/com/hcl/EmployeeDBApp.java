package com.hcl;

import java.sql.Date;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class EmployeeDBApp {

	static Logger log = Logger.getLogger(EmployeeDBApp.class);

	public static void main(String[] args) {
		DBHandler db = new DBHandler();
		// Connect database
		if (db.getConnection() == null) {
			System.out.println("Can not connect database! App exit!");
			return;
		}

		// Create table and initial sample data
		if (!db.createTable().equals("OK")) {
			System.out.println("Can not create table! App exit!");
			return;
		}

		
		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {
			System.out.println("Employee DataBase App");
			System.out.println("1 - Insert a record in EmployeeDB");
			System.out.println("2 - Retrieve all the Employee Info");
			System.out.println("3 - Retrieve an employee record");
			System.out.println("4 - Update an employee record");
			System.out.println("5 - Delete an employee record");
			System.out.println("Any Other Key - Exit");
			System.out.println("Enter Command:");
			System.out.println("Table Columns: EmpID, EmpName, DOB, Salary, Age.");
			String input = scan.nextLine();

			switch (input) {
			// insert record
			case "1": {
				Employee emp = new Employee();
				System.out.println("Insert new employee:");

				System.out.print("\n Employee Name: ");
				input = scan.nextLine();
				emp.setName(input);

				System.out.print("\n Employee DOB: ");
				input = scan.nextLine();
				emp.setDOB(Date.valueOf(input));

				System.out.print("\n Salary: ");
				input = scan.nextLine();
				emp.setSalary(Integer.valueOf(input));

				System.out.print("\n Age: ");
				input = scan.nextLine();
				emp.setAge(Integer.valueOf(input));

				log.debug("insertRecord method called");
				db.insertRecord(emp);
				log.info("Inserting employee with user input details into the Employee table");
				log.error("Please enter employee details correctly into the employee list");
				break;
			}
			case "2": {

				log.debug("showAll method called");
				db.showAll();
				log.info("Showing all records in the Employee table");
				log.error("Error in ShowAll Method");
				break;
			}
			case "3": {
				System.out.println("Enter condition to retrieve: ");
				input = scan.nextLine();
				log.debug("selectRecord method called");
				db.selectRecord(input);
				log.info("Retrieving a specific record from Employee list ");
				log.error("Please enter id correctly");
				break;
			}
			case "4": {
				System.out.println("Enter field and value to update: ");
				input = scan.nextLine();
				System.out.println("Enter condition for updating: ");
				String update = scan.nextLine();
				log.debug("updateRecord method called");
				db.updateRecord(input, update);
				log.info("Updating a specific record from Employee list ");
				log.error("Please enter employee details correctly into the employee list");
				break;
			}
			case "5": {
				System.out.println("Entercondition for delete: ");
				input = scan.nextLine();
				log.debug("deleteRecord method called");
				db.deleteRecord(input);
				log.info("Deleting a specific record from Employee list ");
				log.error("Please enter id correctly");
				break;
			}
			default: {
				System.out.println("Exit");
				return;
			}
			}
		}

		scan.close();

	}
}

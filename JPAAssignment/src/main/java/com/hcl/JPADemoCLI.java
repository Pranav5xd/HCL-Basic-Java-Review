package com.hcl;

import java.util.Scanner;
import com.hcl.utility.JPAOperations;

public class JPADemoCLI {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		JPAOperations op = new JPAOperations();

		while (flag) {
			System.out.println("Student DataBase App");
			System.out.println("1 - Insert Student Entity");
			System.out.println("2 - Retrieve all Entities");
			System.out.println("3 - Retrieve a Student Entity");
			System.out.println("4 - Update a Student Entity");
			System.out.println("5 - Delete  a Student Entity");
			System.out.println("Any Other Key - Exit");
			System.out.println("Enter Command:");
			System.out.println("Table Columns: ID FirstName LastName Email.");
			String input = scan.nextLine();

			switch (input) {
			case "1": {
				System.out.println("Insert new employee:");

				System.out.print("\n Student First Name: ");
				String firstName = scan.nextLine();

				System.out.print("\n Student Last Name: ");
				String lastName = scan.nextLine();

				System.out.print("\n Email: ");
				String email = scan.nextLine();

				op.insert(firstName, lastName, email);
				break;
			}
			case "2": {
				op.findAll();
				break;
			}
			case "3": {
				System.out.println("Student ID to retrieve ");
				int id = scan.nextInt();
				scan.nextLine();
				op.find(id);
				break;
			}
			case "4": {
				System.out.println("Student ID to update ");
				int id = scan.nextInt();
				scan.nextLine();
				System.out.print("\n Student updated First Name: ");
				String firstName = scan.nextLine();

				System.out.print("\n Student updated Last Name: ");
				String lastName = scan.nextLine();

				System.out.print("\n updated Email: ");
				String email = scan.nextLine();
				op.update(id, firstName, lastName, email);
				break;

			}
			case "5": {
				System.out.println("Student ID to delete");
				int id = scan.nextInt();
				scan.nextLine();
				op.remove(id);
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

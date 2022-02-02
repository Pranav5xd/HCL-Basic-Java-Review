package exceptionAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		Scanner scan = new Scanner(System.in); 
		int flag = 0;
		while(flag == 0) {
		    System.out.println("Enter StudentID, Marks and StudentName");
		    int id = scan.nextInt();
		    int score = scan.nextInt();
		    String name = scan.nextLine();
		    try {
		    	if (score < 0 || score > 100 ) {
		    		throw new InvalidScore();
		    	}
		    	else {
		    		Student test = new Student(id, name, score);
		    		students.add(test);
		    		System.out.println("New Student made with id, name and marks:" + id  + name + " " + score);
		    		
		    	}
		    }catch( InvalidScore e) {
		    	System.out.println("Exception thrown  :" + e);
		    }
		    System.out.println("Enter 0 to continue, enter 1 to quit");
		    flag = scan.nextInt();
		}
		scan.close();
	}
}

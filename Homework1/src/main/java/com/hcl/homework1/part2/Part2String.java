package com.hcl.homework1.part2;

import java.util.Scanner;

public class Part2String {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name with a First Middle and Last Name under 10 but over 15 characters");
		String name = scan.nextLine();
		try {
			int size = name.length();
			System.out.println(size);
	    	if (size < 10 || size > 15) {
	    		throw new StringSizeConditionFailure();
	    	}
	    	else {
	    		String[] words = name.split("\\s");
	    		System.out.println("First name is: " + words[0]);
	    		System.out.println("Middle name is: " + words[1]);
	    		System.out.println("Last name is: " + words[2]);
	    	}
	    }catch(StringSizeConditionFailure e) {
	    	System.out.println("Exception thrown  :" + e);
	    }
		scan.close();
	}
}

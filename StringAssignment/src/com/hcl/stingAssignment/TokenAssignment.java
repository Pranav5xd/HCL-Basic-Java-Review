package com.hcl.stingAssignment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenAssignment {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = "";
		
		
		System.out.println("Enter first_middle_last");
		s = scan.nextLine();
		s = s.replaceAll("_", ":");
		System.out.println(s);
		
		
		System.out.println("Enter first_middle_last");
		s = scan.nextLine();
		s = s.replaceAll("_", " ");
		System.out.println(s);
		
		System.out.println("Enter string you would like to tokenize");
		s = scan.nextLine();
		System.out.println("Enter the delimiter you would like to use");
		String delim = scan.nextLine();
		StringTokenizer st = new StringTokenizer(s, delim);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextElement());
		}
		
		System.out.println("Enter first middle last");
		s = scan.nextLine();
		StringBuilder sb = new StringBuilder(s);
		sb.append(" Developer");
		sb.append(" Computer Science");
		System.out.println(sb);
		

		scan.close();
	}
}

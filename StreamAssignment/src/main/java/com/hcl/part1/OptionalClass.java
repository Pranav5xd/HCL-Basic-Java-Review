package com.hcl.part1;

import java.util.Optional;

public class OptionalClass {
	public static void main(String args[]) {
		String[] str = new String[10];
		// str[5] = "Hello World";
		String input = str[5];
		Optional<String> checkNull = Optional.ofNullable(input);
		if (checkNull.isPresent()) {
			System.out.println("We got a string at index 5 it is: " + input);
		} else {
			System.out.println("String does not exist at index 5");
		}
	}
}

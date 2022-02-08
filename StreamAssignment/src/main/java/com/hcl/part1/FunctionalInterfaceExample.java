package com.hcl.part1;

@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class FunctionalInterfaceExample {
	public static void main(String args[]) {
		Square square = (int x) -> x * x;
		int input = 2;
		int output = square.calculate(input);
		System.out.println(output);
	}
}
package com.hcl.part1;

public class LambdaExpression {

	interface Output {
		void printOut(String out);
	}

	public void print(String out, Output output) {
		output.printOut(out);
	}

	public static void main(String args[]) {

		LambdaExpression le = new LambdaExpression();

		Output sameLine = (String out) -> System.out.print(out);
		Output newLine = (String out) -> System.out.println(out);
		Output helloWorld = (String out) -> System.out.println("Hello World! " + out);

		le.print("Dummy Data. ", sameLine);
		le.print("This should be on the same line", sameLine);
		le.print("This should start printing on a new line", newLine);
		le.print("This should be on a new line", newLine);
		le.print("This should be on a new line with Hello World at the front", helloWorld);
	}
}

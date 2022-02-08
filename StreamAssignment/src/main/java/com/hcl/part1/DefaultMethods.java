package com.hcl.part1;

interface MathOperation {
	default int mathOp(int x) {
		return 2 * x;
	}

	int mathOp2(int x);
}

public class DefaultMethods implements MathOperation {
	public int mathOp2(int x) {
		return 3 * x;
	}

	public static void main(String args[]) {
		DefaultMethods dm = new DefaultMethods();
		System.out.println(dm.mathOp(5));
		System.out.println(dm.mathOp2(5));
	}
}

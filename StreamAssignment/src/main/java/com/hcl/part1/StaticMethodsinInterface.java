package com.hcl.part1;

interface math2 {
	static int mathOp(int x) {
		return 2 * x;
	}

	int mathOp2(int x);
}

public class StaticMethodsinInterface implements math2 {
	public int mathOp2(int x) {
		return 3 * x;
	}

	public static void main(String args[]) {
		DefaultMethods dm = new DefaultMethods();
		System.out.println(dm.mathOp(5));
		System.out.println(dm.mathOp2(5));
	}
}

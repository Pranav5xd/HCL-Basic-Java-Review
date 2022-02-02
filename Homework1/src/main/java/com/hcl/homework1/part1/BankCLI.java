package com.hcl.homework1.part1;

import java.util.Scanner;

public class BankCLI {
	public static void main(String args[]) {
		Bank bank = new Bank();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to BankCLI, your current account balance is $0");
		String flag = "y";
		while(flag.equals("y")) {
			System.out.println("Enter D for Deposit, Enter W for Withdraw");
			String op = scan.nextLine();
			if(op.equals("W")) {
				System.out.println("Enter amount you would like to Withdraw");
				bank.withdraw(scan.nextInt());
				scan.nextLine();
			}
			else if(op.equals("D")) {
				System.out.println("Enter amount you would like to Deposit");
				bank.deposit(scan.nextInt());
				scan.nextLine();
			}
			System.out.println("Enter y to continue, Enter n to quit");
			flag = scan.nextLine();
		}
		scan.close();
	}
}

package com.hcl.homework1.part1;

public class Bank {
	int balance;
	
	public Bank() {
		this.balance = 0;
	}
	
	public void withdraw(int amount) {
		try {
	    	if (amount > balance) {
	    		throw new InsufficientBalance();
	    	}
	    	else {
	    		balance = balance - amount;	
	    	}
	    }catch(InsufficientBalance e) {
	    	System.out.println("Exception thrown  :" + e);
	    }
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}
	
}

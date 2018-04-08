package com.techlabs.bank;

public class Account {
	private final String accountNo;
	private final String name;
	private double balance;
	private StatusOption status;

	public Account(String accountNo, String name, double balance, StatusOption status) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.status = status;

	}

	public Account(String accountNo, String name, StatusOption status) {
		this.accountNo = accountNo;
		this.name = name;
		this.status = status;
		this.balance = 800;
	}

	public void deposit(double amt) {
		if (amt < 0) {
			System.out.println("Invalid");
		} else {
			this.balance = this.balance + amt;

		}

	}

	public void withdraw(double amt) {
		if (amt > this.balance || amt < 0 || this.balance < 0 || (this.balance - amt) < 500) {
			System.out.println("Invalid");

		} else {

			this.balance = this.balance - amt;

		}

	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	public StatusOption getStatus() {
		return status;
	}

	public StatusOption setStatus() {
		this.status = status;
		return this.status;
	}

	@Override
	public String toString() {
		return "accno = " + this.accountNo + " name = " + this.name + " balance = " + this.balance + " status = "
				+ this.status + "\n" + "previous=" + super.toString();

	}

	@Override

	public boolean equals(Object obj) {
		Account obj1 = (Account) obj;
		if (this.accountNo == obj1.accountNo && this.name == obj1.name && this.balance == obj1.balance
				&& this.status == obj1.status) {
			return true;

		}
		return false;

	}

}

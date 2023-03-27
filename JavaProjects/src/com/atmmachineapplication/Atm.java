package com.atmmachineapplication;

public class Atm {
	private double balance;
	private double depositedAmount;
	private double withdwalAmount;
	
	
	//default constructor
	public Atm() {
		
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositedAmount() {
		return depositedAmount;
	}
	public void setDepositedAmount(double depositedAmount) {
		this.depositedAmount = depositedAmount;
	}
	public double getWithdwalAmount() {
		return withdwalAmount;
	}
	public void setWithdwalAmount(double withdwalAmount) {
		this.withdwalAmount = withdwalAmount;
	}
	
	
}

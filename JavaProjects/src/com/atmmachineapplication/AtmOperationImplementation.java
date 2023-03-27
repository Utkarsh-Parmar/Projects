package com.atmmachineapplication;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplementation implements AtmOperationInterf {
	
	Atm atm = new Atm();
	Map <Double,String> ministmt= new HashMap<>();
	
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available balance is:" +atm.getBalance() );
		
	}

	@Override
	public void withdrawlAmount(double withdrawlAmount) {
		// TODO Auto-generated method stub
		if(withdrawlAmount<=atm.getBalance()) {
			if(withdrawlAmount%500==0) {
				ministmt.put(withdrawlAmount,"Amount Withdrawn");
				System.out.println("Collect your cash "+ withdrawlAmount);
				atm.setBalance(atm.getBalance()-withdrawlAmount);
				viewBalance();
				
			}else {
				System.out.println("Sorry Amount should be in multiple of 500");
			}
		}else {
			System.out.println("Insufficient Balance.");
		}

	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositAmount,"Amount Deposited");
		System.out.println(depositAmount+ " Rupees Successfully Deposited.");
		atm.setBalance(atm.getBalance()+ depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
	}

}

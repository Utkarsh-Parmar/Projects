package com.atmmachineapplication;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperationInterf op = new AtmOperationImplementation();
		int atmnumber = 12345;
		int atmpin = 123;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine");
		System.out.print("Enter ATM Number: ");
		int atmNumber = sc.nextInt();
		System.out.print("Enter Pin: ");
		int pin = sc.nextInt();
		if((atmnumber == atmNumber) &&(atmpin==pin)) {
			while(true) {
				
				System.out.println("1. View Available Balance\n2. Withdrawl Amount\n3. Deposit Amoount\n4. View Mini Statement\n5. Exit");
				int ch=sc.nextInt();
				switch(ch) {
					case 1: op.viewBalance();
							break;
				
					case 2: System.out.print("Enter the Amount to Withdrawl: ");
							double withdrawlAmount = sc.nextDouble();
							op.withdrawlAmount(withdrawlAmount);
							break;
							
					case 3: System.out.print("Enter Amount to Deposit: ");
							double depositamount =sc.nextDouble();
							op.depositAmount(depositamount);
							
					 		break;
					 		
					case 4: op.viewMiniStatement();
							break;
							
					case 5: System.out.println("Kindly take your Atm card out and Thanks for using ATM machine.");
							System.exit(0);
					
				}
			}
				
		}else {
			System.out.println("Incorrect credentials Either ATM Number is wrong or Pin is incorrect.");
			System.exit(0);
		}
		
		
	}

}

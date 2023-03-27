package com.atmmachineapplication;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int atmnumber = 12345;
		int atmpin = 123;
		Atm atm = new Atm();
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
					case 1: System.out.println("Available balance is:" +atm.getBalance() );
							break;
				
					case 2: System.out.println("Withdrawl Amount is:");
							break;
							
					case 3: System.out.println("Deposit Amount is: ");
					 		break;
					 		
					case 4: System.out.println("Mini Statement is: ");
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

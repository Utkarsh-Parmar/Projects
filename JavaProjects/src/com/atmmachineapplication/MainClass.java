package com.atmmachineapplication;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int atmnumber = 12345;
		int atmpin = 123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine");
		System.out.print("Enter ATM Number: ");
		int atmNumber = sc.nextInt();
		System.out.print("Enter Pin: ");
		int pin = sc.nextInt();
		if((atmnumber == atmNumber) &&(atmpin==pin)) {
			System.out.println("Validation Done;");
			
			
		}else {
			System.out.println("Incorrect credentials Either ATM Number is wrong or Pin is incorrect.");
			System.exit(0);
		}
		
		
	}

}

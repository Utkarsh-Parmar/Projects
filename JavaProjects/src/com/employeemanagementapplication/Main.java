package com.employeemanagementapplication;

import java.util.*;

public class Main {

	static boolean ordering = true;
	public static void menu() {
		System.out.println("**********Welcome To Employee Management System**********"
				+ "\n1. Add Employee "
				+ "\n2. View Employee "
				+ "\n3. Update Employee"
				+ "\n4. Delete Employee"
				+ "\n5. View All Employee"
				+ "\n6. Exit ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeService();
		do {
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Adding Employee");
					es.addEmployee();
					break;
			
			case 2: System.out.println("View Employee");
					es.viewEmp();
					break;
			
			case 3: System.out.println("Update Employee");
					es.updateEmployee();
					break;
			
			case 4: System.out.println("Delete Employee");
					es.deleteEmployee();
					break;
			
			case 5: System.out.println("View All Employee");
					es.viewAllEmps();
					break;
			
			case 6: System.out.println("Thanks for Using Application.");
					System.exit(0);
					break;
			
			default: System.out.println("Invalid Option");
					break;
			} 
		}while(ordering);
		
		sc.close();
	}
}
package com.employeemanagementapplication;

import java.util.*;

public class EmployeeService {
	
	int id;
	String name;
	int age;
	String designation;
	String department;
	double salary;
	
	
	HashSet<Employee> empset = new HashSet<Employee>();
	
	Scanner sc = new Scanner(System.in);
	
	Employee emp1 = new Employee(101,"Puneet",24,"Developer", "IT", 53000);
	Employee emp2 = new Employee(102,"Shivam",25,"Tester", "CO", 40000);
	Employee emp3 = new Employee(103,"Shubham",20,"Devops", "Admin", 50000);
	Employee emp4 = new Employee(104,"Raj",28,"System Eng", "CO", 70000);
	
	
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}
	
	//view all employees
	public void viewAllEmps() {
		for(Employee e:empset) {
			System.out.println(e);
		}
	}
	boolean found = false;
	
	//view emp based on there id
	public void viewEmp() {
		System.out.println("Please Enter the id: ");
		id = sc.nextInt();
		for(Employee e: empset) {
			if(e.getId()==id) {
				System.out.println(e);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not present.");
		}
	}
	
	//update employee
	public void updateEmployee() {
		found = false;
		System.out.println("Enter id: ");
		id = sc.nextInt();
		for(Employee e:empset) {
			if(e.getId()==id) {
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter salary: ");
				double sal = sc.nextDouble();
				e.setName(name);
				e.setSalary(sal);
				System.out.println("Updated Details of employee are: ");
				System.out.println(e);
				found = true;
			}
		}
		if(!found) {
			System.out.println("The employee with this id is not present.");
		}else {
			System.out.println("Employee Details updated successfully");
		}
	}
	
	//delete employee
	public void deleteEmployee() {
		found= false;
		Employee reqemployee=null;
		System.out.println("Enter the id: ");
		id = sc.nextInt();
		for(Employee e: empset) {
			if(e.getId() == id) {
				reqemployee = e;
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee is not available.");
		}else {
			empset.remove(reqemployee);
			System.out.println("Employee deleted successfully.");
		}	
	}
	
	//Add employee
	public void addEmployee() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter age: ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter designation: ");
		designation = sc.nextLine();
		System.out.println("Enter department: ");
		department = sc.next();
//		sc.nextLine();
		System.out.println("Enter salary: ");
		salary= sc.nextDouble();
		
		Employee emp = new Employee(id, name, age, designation, department, salary);
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee Added Successfully");
	}
	
}

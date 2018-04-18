package main.java;

import java.util.ArrayList;

public class TestEmployee {
	
	public static void main(String[] args) {
		System.out.println("This is an example of Inheritance and Overloading super calss methods");
		
		String[] projects = {"NewGen Services","QMatra","Nacto","Oreo Website"};
		
		//creating a Manager Object
		Manager manager = new Manager("M10", "Pranathi", "Technical Manager", "Female", 15, 230000);
		manager.subEmployees = new ArrayList<Employee>();
		manager.projects = projects;
		//adding employees under that Manager
		manager.addEmployees("E101", "Ayushi", "Software Developer", "Female", 5.5f, 50000);
		manager.addEmployees("E102","Bhuvan", "Junior Architect", "Male", 10f, 120000);
		manager.addEmployees("E103","Charan", "Senior Java Developer", "Male", 4.7f, 30000);
		manager.addEmployees("E104","Dhanvi", "Tech Lead", "Female", 12.10f, 195000);
		manager.addEmployees("E105", "Esha", "Test Engineer", "Female", 8f, 80000);
		
		//printing Manager Details
		System.out.println("Manager Details are ");
		System.out.println("ID: "+ manager.employeeId + " Name: " + manager.name + " Designation: "+ manager.designation + " Salary:" + manager.salary);
		System.out.println("Reviewed Salary for manager is " + manager.calculateHike(6));
		
		//Printing Employee details
		System.out.println("Employees under " + manager.name +" are");
		manager.subEmployees.stream().forEach(employee -> {
			System.out.println("ID: "+ employee.employeeId + " Name: " + employee.name + " Designation: "+ employee.designation + " Salary:" + employee.salary);
			System.out.println("reviewed salary after hike is is " + employee.calculateHike(12));
		});
		
		//Removing one employee
		manager.removeEmployee("E105");
		System.out.println("Reviewed List of Employees under " + manager.name +" are");
		manager.subEmployees.stream().forEach(employee -> {
			System.out.println("ID: "+ employee.employeeId + " Name: " + employee.name + " Designation: "+ employee.designation + " Salary:" + employee.salary);
		});
		
	}

}

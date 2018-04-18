package main.java;

import java.util.List;
/*
 * This is child class which extends Employee class
 */
public class Manager extends Employee {
	
	
	public List<Employee> subEmployees;
	
	public String[] projects;
	
	//declaring child class constructor
	Manager(String employeeId, String name, String designation, String gender, float experience, double salary, List<Employee> subEmployees, String[] projects) {
		super(employeeId, name, designation, gender, experience, salary); //calling super class constructor
		this.subEmployees = subEmployees;
		this.projects = projects;
	}
	
	Manager(String employeeId, String name, String designation, String gender, float experience, double salary) {
		super(employeeId, name, designation, gender, experience, salary);
	}

	//method to add Employees
	public List<Employee> addEmployees(String employeeId, String name, String designation, String gender, float experience, double salary){
		Employee employee = new Employee(employeeId, name, designation, gender, experience, salary);
		this.subEmployees.add(employee);
		return this.subEmployees;
		
	}
	
	//method to remove employees
	public void removeEmployee(String employeeId) {
		Employee employee = getEmployeeById(employeeId);
		if(employee != null) {
			this.subEmployees.remove(employee);
			System.out.println(employee.name + " is removed");
		}
	}
	
	//method to get employee based on their Id
	public Employee getEmployeeById(String employeeId) {
		for(Employee emp : this.subEmployees) {
			if(emp.employeeId.equals(employeeId)) {
				return emp;
			}
		}
		return null;
	}
	
	//overriding super class method
	public double calculateHike(float hikePercentage) {
		
		if(hikePercentage > 0) {
			double salaryReviewed = this.salary + (this.salary * (hikePercentage/100));
			salaryReviewed = salaryReviewed + (this.salary * 0.1); //considering 10% of his last salary as extra allowance for managers
			return salaryReviewed;
		}else {
			return this.salary;
		}
	}

}

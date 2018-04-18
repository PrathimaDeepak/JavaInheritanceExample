package main.java;

/*
 * This is parent class - Employee
 */
public class Employee {
	
	public String employeeId;
	
	public String name;
	
	public String designation;
	
	public String gender;
	
	public float experience;
	
	public double salary;
	
	//declaring a parent class constructor
	Employee(String employeeId, String name, String designation, String gender, float experience, double salary){
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.experience = experience;
		this.salary = salary;
	}
	
	//method to calculate hike for each employee based on the hike percentage
	public double calculateHike(float hikePercentage) {
		
		if(hikePercentage > 0) {
			return (this.salary + (this.salary * (hikePercentage/100)));
		}else {
			return this.salary;
		}
	}
	
}

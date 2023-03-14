package com.company.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private String department;
	private String company;
	
	
	public Employee(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;

		
	}
	public Employee(String firstName, String lastName, String emailAddress) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getemailAddress() {
		return emailAddress;
	}
	public void setemailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public String getcompany() {
		return company;
	}
	public void setcompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Employee{" + "firstName='" + firstName + '\'' + 
				", lastName='" + lastName + '\''+
				", emailAddress='" + emailAddress +'\''+ 
				", password='" + password + '\'' + 
				", company='" + company + '\''+ 
				", department='" + department + '\'' + 
				'}';
		
	}

}

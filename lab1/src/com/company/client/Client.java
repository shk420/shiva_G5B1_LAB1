package com.company.client;
import java.util.Scanner;

import com.company.model.Employee;
import com.company.service.*;


public class Client {
	public static void main(String[] args) {
		Employee employee = new Employee("shiva","kumar");
		employee.setcompany("TCS");
		CredentialServiceImpl credentialServices = new CredentialServiceImpl();
		
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		
		switch(option) {
		
		case 1:{
			String generatedEmail = credentialServices.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),employee.getcompany().toLowerCase(),"tech");
			String generatedPassword = credentialServices.generatePassword(12);
			employee.setemailAddress(generatedEmail);
			employee.setpassword(generatedPassword);
			credentialServices.displayCredentials(employee);
			break;
			
		}
		case 2:{
			String generatedEmail = credentialServices.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),employee.getcompany().toLowerCase(),"admin");
			String generatedPassword = credentialServices.generatePassword(12);
			employee.setemailAddress(generatedEmail);
			employee.setpassword(generatedPassword);
			credentialServices.displayCredentials(employee);
			break;
			
		}
		case 3:{
			String generatedEmail = credentialServices.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),employee.getcompany().toLowerCase(),"hr");
			String generatedPassword = credentialServices.generatePassword(12);
			employee.setemailAddress(generatedEmail);
			employee.setpassword(generatedPassword);
			credentialServices.displayCredentials(employee);
			break;
			
		}
		case 4:{
			String generatedEmail = credentialServices.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),employee.getcompany().toLowerCase(),"legal");
			String generatedPassword = credentialServices.generatePassword(12);
			employee.setemailAddress(generatedEmail);
			employee.setpassword(generatedPassword);
			credentialServices.displayCredentials(employee);
			break;
			
		}
		default:{
			System.out.println("Choose valid Option");
		}
		
		}
		
		
		
	}

}

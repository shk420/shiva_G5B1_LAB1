package com.company.service;

import java.security.SecureRandom;

import com.company.model.Employee;

public class CredentialServiceImpl implements CredentialServices {


	public void displayCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are as follows:");
        System.out.println("Email: " + employee.getemailAddress());
        System.out.println("Password: " + employee.getpassword());
	
	}

	public String generateEmailAddress(String firstName, String lastName, String department,
			String company) {
		
		String email = firstName + lastName + '@' + department + "." + company + ".com";
		return email;
	}


	public String generatePassword(int maxlength) {
		 final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=";
		 SecureRandom random = new SecureRandom();
	     StringBuilder sb = new StringBuilder();
	     
	     for (int i = 0; i < maxlength; i++)
	        {
	            int randomIndex = random.nextInt(chars.length());
	            sb.append(chars.charAt(randomIndex));
	        }
	 
	        return sb.toString();
	}

}

package com.company.service;

import com.company.model.*;

public interface CredentialServices {

	
	String generateEmailAddress(String firstName, String lastName,String department, String company);
	String generatePassword(int maxlength);
	void displayCredentials(Employee employee);
}

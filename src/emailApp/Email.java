package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailCapacity;
	private int defaultPasswordLength = 10;
	private String altEmail;

	//Constructor to receive first and last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password 
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
	}
	//Ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Department code:");
		Scanner input = new Scanner(System.in);
		int deptChoice = input.nextInt();
		
		if (deptChoice == 1) {return "Sales";}
		else if (deptChoice == 2) {return "Dev";}
		else if (deptChoice == 3) {return "Accounting";}
		else{return "";}

		
	}
	
	//Generate a random password 
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int randVal = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randVal);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	
	//Set the alternate email
	
	//Change password
}

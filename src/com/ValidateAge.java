package com;

import java.util.Scanner;

//	Main Class to validating the age
public class ValidateAge {
	
	//	Main method which throws NegativeAgeException user defined exception 
	public static void main(String arg []) throws NegativeAgeException {
		int age;																		//	Variable to take the age from the user
		Scanner userInput = new Scanner(System.in);										//	Scanner object to get the data from the console
		
		System.out.print("Enter Age for validating : ");
		
		age = userInput.nextInt();														//	Assign the data from the user to variable
		
		if(age < 0){																	//	Logic to validate the age
			userInput.close();															//	Closing the Scanner stream
			throw new NegativeAgeException("Entered age is not valid - Negative AGE");	//	Throwing the custom exception with defined message
		} else {
			System.out.println("Enetered Age is valid");
		}
		
		userInput.close();
	}
}
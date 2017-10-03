package com;

//	User defined Exception Class extending the Exception Class
public class NegativeAgeException extends Exception{

	String errorMessage;						//	Class Variable to get the user sent message and modifying it to specified format
	
	NegativeAgeException(String message){		//	Constructor of the class where user message is assigned to class variale
		errorMessage = message;
	}
	
	public String toString(){					//	Method to format the error string
		return ("Error Message : " + errorMessage);
	}
}

package com.javabasic.www;

public class SwitchStatement {

	public static void main(String [] args) {
		
		//Switch case statement we use when we have number of option (or choices) and we may need to perform a different task for each choice
		
		// switch case statement is mostly used with break statement even though it is optional
		
		int num =2;
		switch(num+2) {
		
		case 1: 
			System.out .println("case 1: value is " +num);
			
			break;
			
		case 2:
			System.out.println("Case 2: Hi");
			break;
			
		case 4:
			System.out.println("Case 3: hellooo");
			
		}
		
	}
}

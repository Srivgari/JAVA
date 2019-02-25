package com.javabasic.www;

public class IfElseProgram {

	public static void main(String [] args) {
		
		// when we need to execute a set of statement based on a condition then we need to use Control statement. 
		//In this tutorial will see four types of control statements that you can use in java program based on requirement-
		
	//a) if statement, b) nested if statement ,c) if-else statement, d) if-else-if statement
		
		int num = 70;
		if(num < 100) {
			
			System.out.println("number is less than 100");
			 
			if (num > 50) {
				
				System.out.println("number is greater than 50");
			}
			
			else {
				System.out.println("num is greater than or equal 50");
			}
			
		}
		
		
			if(num > 80) {
				
				System.out.println("no");
			
			}
			else if(num == 70) {
				
				System.out.println("Yes");
		
			}
			System.out.println("Garima");
		}
		
		
		
	}
	


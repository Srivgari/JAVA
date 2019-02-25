package com.javabasic.www;

public class LoopExample {
	
	public static void main(String [] args) {
		
	// Loops are used to execute a set of statements repeatedly until a particular condition is satisfied. in java we have 3 types of loop- for, while and do-while
		
		for(int i=10; i>1; i--) {
			
			System.out.println("The value of i is : "+i);
		}
		
		// infinite loop
		//for(int j=1; j>=1; j++) {
			
		//	System.out.println("Infinite");
		//}
		
		int arr[] = {2,9,1,5,10};
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
	

}

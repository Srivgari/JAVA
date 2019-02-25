package com.javabasic.www;

public class BitwiseOperator {
	
	public static void main(String [] args) {
		
		int num1 = 11; /*11 = 00001011*/ 
		int num2 = 22; /*22 = 00010110 */
		int result = 0;
		
		// num1 & num2 = compares corresponding bits of num1 and num2 and generates 1 if both bits are equal, else it returns 0. In our case it would return: 2 which is 00000010 	because in the binary form of num1 and num2 only second last are matching.
		
		result = num1&num2;
		System.out.println("Result of &:" +result);
		
		
		//num1 | num2 = compares corresponding bits of num1 and num2 and generates 1 if either bit is 1 else return 0. in our case it will return 31 which is 00011111
		
		result = num1|num2;
		System.out.println("Result of |: " +result);
		
		//num1 ^ num2 = compares corresponding bits num1 and num2  and generates 1 they are not equal else returns 0. in our example it would return 29 which is equivalent to 00011101.
		
		result = num1^num2;
		System.out.println("Result of ^: " +result);
		
		//~num1 = its a complement operator it changes 1 to 0 and 0 to 1.
	    
		result = ~num1;
		System.out.println("Result of complement :" +result);
		
		// num1 << 2 is left shift operator that just moves the bits to the left , discards the far left bit, and assign the rightmost bit a value of 0. in our case output is 44 which is 00101100
		
		result = num1 <<2;
		System.out.println("Result of lest shift is :" +result);
		
		// num1 >> 2 is right shift operator that moves the bits to the right discard the far right bit, and assign the leftmost bit a value of 0. in our case output is 2 which is equivalent to 00000010
		
		
		result = num1 >> 2;
		System.out.println("Result of right shift" +result);
		
			
	}

}

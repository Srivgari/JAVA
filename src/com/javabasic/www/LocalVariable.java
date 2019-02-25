package com.javabasic.www;

public class LocalVariable {
	
	//These variables are declared inside method of the class. Their scope is limited to the method which means that you can't change their values and access them outside of the method
	
	//instance variable
	public String myVar = "instance method";
	
	public void myMethod() {
		
		//local variable
		
		String myVar = "Inside method";
		System.out.println(myVar);
		
	}
	
	public static void main(String args[]) {
		
		//Creating object
		
		 LocalVariable obj = new LocalVariable();
		 
		 //we are calling the method that changes the value of myVar. We are displaying myVar again after the method call, to demonstrate that the local variable scope  is limited to the method itself
		 
		 
		 System.out.println("Calling method");
		 obj.myMethod();
		 
//If i hadn't declared the instances variable and only declared the local variable inside method then the statement System.out.println(obj.myVar); would  have thrown compilation error. As you cannot change and access local variables outside the method.		 
		 System.out.println(obj.myVar);
	
	
	}
	
	

}

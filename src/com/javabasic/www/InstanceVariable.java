package com.javabasic.www;

public class InstanceVariable {
	
	//Each instance (object) of class has its own copy of instance variable. Unlike static variable, instance variable have their own copy of instance variable. 
	
	String myInstanceVar = "instance variable";
	
	public static void main(String[] args) {
	
		//creating 3 instances(Objects) of class Instance Variable
		InstanceVariable obj1 = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();
		InstanceVariable obj3 = new InstanceVariable();
		
		//calling and printing the variable using object reference
		System.out.println(obj1.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
		//Change the value of instance using obj1
		
		obj1.myInstanceVar = "Changed Instance variable";
		
		System.out.println(obj1.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
		
	}

}

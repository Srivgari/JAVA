package com.javabasic.www;

class ParentClass{
	
	void display() {
		System.out.println("Hi");
	}
}

public class StaticVariable extends ParentClass {
	
	// Static variable also known as class variable because they are associated with the class and common for all the instances of call.
	
	 public static String myClassVar = "Class or static variable";
	 
	 public static void main(String [] args) {
	
		 //Creating 3 objects of class StaticVariable, it would be common for all, the changes made to variable using one object would reflect  when you access it through other objects
	
		// We can create object and print the variable by referencing object but it gives warning like- "The Static field StaticVariable.myClassVar should be accessed in a static way."
		 // So we are printing the variable by using Class name as reference
		 
	//	 StaticVariable obj1 = new StaticVariable();
	//	 StaticVariable obj2 = new StaticVariable();
//		 StaticVariable obj3 = new StaticVariable();
		 
		 //All three will display "class or static variable"
		 System.out.println(StaticVariable.myClassVar);
		 System.out.println(StaticVariable.myClassVar);
         System.out.println(StaticVariable.myClassVar);
         
         //Changing the value of static variable 
         //We can change the value of Static variable but for all instance it will be same
         
       myClassVar = "Changed Text";
         
         //All three will display "changed text"
         System.out.println(StaticVariable.myClassVar);
         System.out.println(StaticVariable.myClassVar);
         System.out.println(StaticVariable.myClassVar);
         
             //    obj.display();
          
	 }

}

//unknown exception
package com.project.Exceptionhandling;

public class Exception_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts");
		
		String name = "hello";
		System.out.println(name.length()); // it will print the length of the string
		
		try {
		String name1 = null; //no object //java.lang.NullPointerException at com.project.Exceptionhandling.Exception_3
		System.out.println(name1.length()); //invalid as there is no object so no length either
		}catch(Exception e) {//Exception is the super class of all exceptions and when we don't know the exception we can use this
			
		}
		System.out.println("Program ends");
		
	}

}

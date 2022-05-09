package com.project.implementations;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  // create strings
	    String first = "Java"; //If the string already exists, the new string is not created. 
	    //Instead, the new reference, example points to the already existed string (Java).
	    String second = "is a Object Oriented Programming";
	    String third = "Language";

	    // print strings
	    System.out.println(first);   // print Java
	    System.out.println(second);  // print Python
	    System.out.println(third);   // print JavaScript
	    System.out.println();
	    
	 // create a string
	    String greet = "Hello! World";
	    System.out.println("String: " + greet);

	    // get the length of greet
	    int length = greet.length();
	    System.out.println("Length: " + length);
	    
	 // create first string
	    System.out.println("First String: " + first);

	    // create second
	    System.out.println("Second String: " + second);
	    System.out.println();

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    System.out.println();
	    
	 // create 3 strings
	    // compare first and second strings
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	    System.out.println();
	    
	 // use the escape character
	    String exam = "This is the \"String\" class.";
	    System.out.println(exam);

	}

}

package com.project.implementation.javaBasics;

public class IncrementationDecrementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pre-Incrementation
		int a = 1;
		System.out.println("Pre-Incrementation");
		System.out.println("++a = "+ ++a);
		System.out.println("a = "+a);
		
		//Pre-Decrementation
		System.out.println("Pre-Decrementation");
		System.out.println("--a = " + --a);
		System.out.println("a = "+a);
		
		//Post-Incrementation
		System.out.println("Post-Incrementation");
		System.out.println("a++ = "+ a++);
		System.out.println("a = "+a);
		
		//Post-Decrementation
		System.out.println("Post-Decrementation");
		System.out.println("a-- = "+ a--);
		System.out.println("a = "+a);
	}

}

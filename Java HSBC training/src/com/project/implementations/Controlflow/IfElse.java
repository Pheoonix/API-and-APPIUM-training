package com.project.implementations.Controlflow;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter true or false");
		boolean con = sc.nextBoolean();
	    // con = true;
	     
	    if(con) {
	      System.out.println("Condition is true");
	    } 
	    else
	    {
	      System.out.println("Condition is false");
	    }
	}

}

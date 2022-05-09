package com.project.implementations.Controlflow;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A or B");
		String value = sc.nextLine();
		//String value = "B";
	    switch (value) 
	    {
	      case "A":
	      case "a":
		    System.out.println("Value is A");
		    break;
	      case "B": 
	      case "b":
		    System.out.println("Value is B");
		    break;
	      default:
	        System.out.println("Value is neither A nor B");
	        break;
	    }
	}

}

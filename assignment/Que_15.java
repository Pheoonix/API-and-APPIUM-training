//Java Program to Check Whether a Character is Alphabet or Not

package assignment;

import java.util.Scanner;

public class Que_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // declare a variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to be checked");
		char c = sc.next().charAt(0);
	    // checks if c is an alphabet
	    if (Character.isAlphabetic(c)) { //using method Alphabetic
	      System.out.println(c + " is an alphabet.");
	    }
	    else {
	      System.out.println(c + " is not an alphabet.");
	    }
	}

}

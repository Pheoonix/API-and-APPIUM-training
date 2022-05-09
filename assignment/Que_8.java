package assignment;

import java.util.Scanner;

public class Que_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1, 2, 3, 4, 5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be found");
		int m = sc.nextInt();
	    
	    boolean found = false;

	    for (int n : num) {
	      if (n == m) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(m + " is found.");
	    else
	      System.out.println(m + " is not found.");
	  }
	}



//Check Whether a Number is Prime or Not

package assignment;

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n= s.nextInt(); 
		String result = prime(n);
		System.out.println(result);
	}
	public static String prime(int i) {
		int flag = 0;
		// 0 and 1 are not prime numbers
		// change flag to 1 for non-prime number
		if (i == 0 || i == 1)
		    flag = 1;
		  for (int j = 2; j <= i / 2; ++j) {

			    // if n is divisible by i, then n is not prime
			    // change flag to 1 for non-prime number
			    if (i % j == 0) {
			      flag = 1;
			    }
			  }
		  // flag is 0 for prime numbers
		  if (flag == 0) {
			    return i+" is a prime number.";
			  }
			  else {
				  return i+" is not a prime number";
			  }
		
	}
}

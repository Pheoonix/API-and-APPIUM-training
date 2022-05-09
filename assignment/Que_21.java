//Java Program to Check Whether a Number is Even or Odd

package assignment;

import java.util.Scanner;

public class Que_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that need to be checked");
		int n = sc.nextInt();	
		if(n%2==0) {
			System.out.println(n+" is Even");
		}
		else {
			System.out.println(n+" is Odd");
		}
	}

}

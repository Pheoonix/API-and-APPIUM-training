//Java Program to Find the Frequency of Character in a String

package assignment;

import java.util.Scanner;

public class Que_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Count = 0;
		char a = 'e';
		//Declare a string    
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		//str = str.toLowerCase();   
		
		for(int i = 0;i<str.length();i++) {
				if(a==str.charAt(i)) {
					
					++Count;
				}
		}
		System.out.println(Count);
	}

}

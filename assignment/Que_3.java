package assignment;

import java.util.Scanner;

public class Que_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string :");
		a = s.nextLine();
		int n = a.length();
		for(int i = n - 1; i >= 0; i--)
		{
		b = b + a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
		System.out.println("The string is a palindrome");
		}
		else
		{
		System.out.println("The string is not a palindrome");
		}
		}
	}



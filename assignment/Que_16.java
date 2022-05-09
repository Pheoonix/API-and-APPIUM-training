//Java Program to Generate Multiplication Table

package assignment;

import java.util.Scanner;

public class Que_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of which multiplication table is need to generate");
		int n = sc.nextInt();
		for(int i=0; i<=10; i++) {
			mul = n*i;
			System.out.println(n+"x"+i+"="+mul);
		}

	}

}

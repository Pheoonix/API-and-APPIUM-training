package assignment;

import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the till what term");
		int n = sc.nextInt();
	    int f1 = 0, f2 = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(f1+", ");

	      // compute the next term
	      int nextTerm = f1 + f2;
	      f1 = f2;
	      f2 = nextTerm;
	}

}
}

//Java Code To Create Pyramid and Pattern

package assignment;

import java.util.Scanner;

public class Que_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("================Enter===============");
		System.out.println("1. Half pyramid using *");
		System.out.println("2. Half pyramid a using numbers");
		System.out.println("3. Half pyramid using alphabets");
		System.out.println("4. Inverted half pyramid using *");
		System.out.println("5. Full pyramid using *");
		System.out.println("6. Inverted full pyramid using *");
		System.out.println("7. Pascal's triangle");
		System.out.println("8. Floyd's Triangle");
		System.out.println("9. Exit");
		int n = sc.nextInt();
		
do {
	System.out.println("================Enter===============");
	System.out.println("1. Half pyramid using *");
	System.out.println("2. Half pyramid a using numbers");
	System.out.println("3. Half pyramid using alphabets");
	System.out.println("4. Inverted half pyramid using *");
	System.out.println("5. Full pyramid using *");
	System.out.println("6. Inverted full pyramid using *");
	System.out.println("7. Pascal's triangle");
	System.out.println("8. Floyd's Triangle");
	System.out.println("9. Exit");
		switch(n) {
		case 1:
				Halfpstr();
				break;
		case 2:
				Halfpnum();
				break;
		case 3:
				Halfpalph();
				break;
		case 4:
				InvHalfpstr();
				break;
		case 5:
				Fullpstr();
				break;
		case 6:
				InvFullpstr();
				break;
		case 7:
				Pascal();
				break;
		case 8:
				Floyd();
				break;
		case 9:
			 	break;
		default: 
				System.out.println("Error: invalid number!!!");
				break;
			}
	}while(n==0);
}
//half pyramid using *
	public static void Halfpstr() {
		int rows = 5;

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	}
	}
	
//half pyramid a using numbers
	public static void Halfpnum() {
	    int rows = 5;

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	}
	
//half pyramid using alphabets
	public static void Halfpalph() {
	    char last = 'E', alphabet = 'A';

	    for (int i = 1; i <= (last - 'A' + 1); ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(alphabet + " ");
	      }
	      ++alphabet;

	      System.out.println();
	    }
	}
	
//Inverted half pyramid using *
	public static void InvHalfpstr() {
	    int rows = 5;

	    for (int i = rows; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	}
	
//full pyramid using *
	public static void Fullpstr() {
		int rows = 5, k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	}
	
//Inverted full pyramid using *
	public static void InvFullpstr() {
		int rows = 5;

	    for(int i = rows; i >= 1; --i) {
	      for(int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      for(int j=i; j <= 2 * i - 1; ++j) {
	        System.out.print("* ");
	      }

	      for(int j = 0; j < i - 1; ++j) {
	        System.out.print("* ");
	      }

	      System.out.println();
	    }
	}
	
//Pascal's triangle
	public static void Pascal() {
		 int rows = 6, coef = 1;

		    for(int i = 0; i < rows; i++) {
		      for(int space = 1; space < rows - i; ++space) {
		        System.out.print("  ");
		      }

		      for(int j = 0; j <= i; j++) {
		        if (j == 0 || i == 0)
		          coef = 1;
		        else
		          coef = coef * (i - j + 1) / j;

		        System.out.printf("%4d", coef);
		      }

		      System.out.println();
		    }
	}
	
//Floyd's Triangle
	public static void Floyd() {
		int rows = 4, number = 1;

	    for(int i = 1; i <= rows; i++) {

	      for(int j = 1; j <= i; j++) {
	        System.out.print(number + " ");
	        ++number;
	      }

	      System.out.println();
	    }
	}
}

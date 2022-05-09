//Multiple exception
package com.project.Exceptionhandling;

public class Exception_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts");
		
		int[] myarry= {3,9,45,22,16};
		//System.out.println(myarry[2]); //45
		
		// java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 5 at com.project.Exceptionhandling.Exception_1
		
		try {	
			//java.lang.ArithmeticException: / by zero at com.project.Exceptionhandling.Exception_2
			int result = myarry[1] / 0;
		System.out.println(myarry[1]); //we are trying to find an element at the index number which does not exist as it has 5 elements only
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException exception){
			//optional
			System.out.println("There is an exception please enter the index under 5 !!");
		} finally { //this block is always executed even if there is no exception
			//optional
			System.out.println("Finally block executed");
		}
		System.out.println("Program ends");
	}

}

package com.project.Exceptionhandling;

public class Exception_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try {
					excep();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public static void excep() throws Exception{ //throws exception and the exception now will be handled in main method not in this method
		int[] myarry= {3,9,45,22,16};
		System.out.println(myarry[12]); 
		throw new ArithmeticException("exception thrown"); // throw an exception
	}

}

package com.project.implementations.Controlflow;

public class DoWhileLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;   //initialization
		int sum = 0;
		 
		do
		{
		    sum = sum + i;
		    i++;    //incrementation
		}
		while (i <= 10);    //condition checking
		 
		System.out.println(sum);
	}

}

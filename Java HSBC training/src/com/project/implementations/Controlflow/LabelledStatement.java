package com.project.implementations.Controlflow;

public class LabelledStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop: for(int i=0; i < 6; i++) 
	    {
	      if(i % 2 == 0) 
	      {
	        System.out.println("In if block :: " + i);
	        continue loop; //continue will bring control back to start like break statement is 
	        //encountered that control immediately goes out of enclosing labeled block
	      } 
	      else
	      {
	        System.out.println("In else block :: " + i);
	      }
	    }
	}

}

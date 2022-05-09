//Java Program to Convert String to Date

package assignment;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Que_23 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String sDate1="31/12/1998";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  
	}

}

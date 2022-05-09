//Java Program to Convert List (ArrayList) to Array and Vice-Versa

package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList languages1 = new ArrayList<>();

	    // Add elements in the list
	    languages1.add("Java");
	    languages1.add("Python");
	    languages1.add("JavaScript");
	    System.out.println("ArrayList: " + languages1);

	    // Create a new array of String type
	    String[] arr = new String[languages1.size()];

	    // Convert ArrayList into the string array
	    languages1.toArray(arr);
	    System.out.print("Array: ");
	    for(String item:arr) {
	      System.out.print(item+", ");
	    }
	    System.out.println("\n");
	    System.out.println("Convert java array to array list");
	   

	      // convert array to list
	      List languages= new ArrayList<>(Arrays.asList(arr));

	      System.out.println("List: " + languages);
	    
	}

}

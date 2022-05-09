//How to Convert List into Array and Array to List

package assignment;

import java.util.ArrayList;

public class Que_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
	      list.add("Apple");
	      list.add("Orange");
	      list.add("Banana");

	      System.out.println("Contents of list ::"+list);
	      String[] myArray = new String[list.size()];
	      list.toArray(myArray);

	      for(int i=0; i<myArray.length; i++){
	         System.out.println("Element at the index "+i+" is ::"+myArray[i]);
	}

}
}

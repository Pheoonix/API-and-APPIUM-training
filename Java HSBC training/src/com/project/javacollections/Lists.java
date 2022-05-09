package com.project.javacollections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int roll;
	String name;
	
}
public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); //Data type can be anything String Integer etc depending on the type it will store respective object
		//to store any kind of data
		ArrayList list1 = new ArrayList();
		
		Student s1 = new Student();
		s1.roll = 10;
		s1.name = "Sarita";
		//Addition of data in the list //data gets stored in indexes
		list.add("Rose");   		//0
		list.add("Marigold");		//1
		list.add("Sunflower");		//2
		list.add("Daisy");			//3
		list.add("Lily");			//4
		//list.add(1);//error		
		list1.add("Jasmine");		
		list1.add("Lotus");	
		list1.add(44);
		list1.add(2.33);
		list1.add(s1);
		
		//Printing reference to list (sequential addition of elements)
		System.out.println("List is: "+list);
		System.out.println("List1 is: "+list1);
		
		
		//Get the element from list
		String name = list.get(2); // gets the data at 2 index
		System.out.println("name is: "+name);
		
		Object o = list1.get(2);
		System.out.println("o is "+o);
		
		//Update element in List
		list.set(2, "Lavender");
		System.out.println("List is: "+list);
		
		//Remove element from List
		list.remove(1);
		System.out.println("List is: "+list);
		
		//Finding element in list
		boolean s=list.contains("Marigold");
		System.out.println(s);
		
		
		
		//Iterate in Arraylist
		System.out.println("Iterating with normal For loop");
		for(int i = 0; i<list.size();i++){
			System.out.println(list.get(i));
		} 
		System.out.println("================================");
		System.out.println("Iterating with Enhanced For loop");
		for(String str: list) { //
			System.out.println(str);
		}
		System.out.println("================================");
		
		System.out.println("Iterating with Iterator");
		Iterator<String> itr = list.iterator();
		//System.out.println(itr.next()); //iterator shows the elements one by one
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if(str.equals("Daisy")) {
				itr.remove();
			}
			
		}
		System.out.println("===========================");
		System.out.println("List is: "+list);
		
		//Remove all
		list.clear();
		System.out.println("List is: "+list);
	}

}

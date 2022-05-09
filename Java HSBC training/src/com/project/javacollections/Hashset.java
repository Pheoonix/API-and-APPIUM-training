package com.project.javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>(); //data is unordered but it is alphabetically sorted
		
		//Performance of the tree set is bit low as compared to hash set because it takes additional time to sort the data
		
		//Here data is not added as in indexing approach
		//We got hashCodes for elements which are being added
		set.add("Ruhi");
		set.add("Mahi");
		set.add("Dipika");
		set.add("Rohan");
		set.add("Geeta");
		
		//Data is Unique, no Redundancy
		//Data is unordered in output due to hashing
		System.out.println("set is: "+set);
		//we cannot use loop here there is nothing like indexing but we can use iterator
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		set.remove("Mahi");
		System.out.println("set after removing Mahi is: "+set );
		
		boolean a=set.contains("Dipika");
		System.out.println("set size is: "+set.size());
	}

}

package com.project.oops;

//Textual Representation how an object will look like in memory
//whatever we write in class is in actual the property of object as we are describing the object
//If you want anything which should belong to class make it static !! (so pid name price these does not belong to class , constructor methods they belong to the object)
class Product{
	
	//Attributes (state)
	//private int pid;
	int pid;
	String name;
	int price;
	
	//Constructor Default one
	Product(){
		System.out.println(">> Product Object constructed");
	}
	
	//Methods (Behavior)
	//To write data in Product Object we have this Method
	void setProductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		System.out.println(">> Data Written in Product Object");
	}
	
	//To read data from Product Object
	void showProductDetails() {
		System.out.println("-------Product ID: "+pid+"--------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("----------------------------------");
	}
	
	//setters
//	void setPid(int id) {
//		this.pid = pid; //this means ref to current object
//		//LHS belongs to object RHS belongs to the method
//	}
//	
//	//getters
//	int getPid() {
//		return pid;
//	}
//	//setters and getter required when your attributes are marked as private

}

class Mobile extends Product{// IS-A relation, Mobile IS-A Product, Mobile is child, Product is parent
	
	//Additional Attributes of mobile other than the product
	String os;
	int ram;
	int sdcardsize;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	//we have redefined the same method from the parent into the child with different inputs 
	//we have now 2 methods in the child, 1 from parent and 1 from child
	//both are different as in based on inputs (even though name is same)
	//we did this because we wanted to set the data of the additional attributes
	//METHOD OVERLOADING: Same Method Name with different Input
	//we use this so that we get exact data we want 
	void setProductDetails(int pid, String name, int price,String os,int ram, int sdcardsize) {
		this.pid = pid;  //it was private before we need to change it because private is not inherited and visible into the child
		this.name = name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdcardsize = sdcardsize;
		System.out.println(">> Data Written in Product Object");
	}
	
	//Lets redefine showProductDetails as well.
	//But here we have same inputs 
	//2 methods 1 from parents and other in child and we have same signatures(same input details !!
	//child method will be executed and not the parent method
	//MEHOD OVERRIDING: Same Method name with same inputs in parent child relationship
	//we use this so that we can display more data
	void showProductDetails() {
		System.out.println("-------Product ID: "+pid+"--------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("OS:\t"+os);
		System.out.println("RAM:\t"+ram);
		System.out.println("SDcard:\t"+sdcardsize);
		System.out.println("----------------------------------");
	}

}

public class InheritanceApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Create an Object - product
		// product is not an object its a reference variable which holds the hashCode of the object in hexadecimal notation
		Product product1 = new Product();
		//System.out.println("product is: "+product1); //we will get a hexadecimal code as a hascode, so product is a ref var not an object
		
		//Writing data in Object
		product1.setProductDetails(101,"iphonex",70000);
		
		//Reading data from Object
		product1.showProductDetails();
		
		//Lets write data directly
		Product product2 = new Product();
		//product2.pid = 201; error now since attribute marked as private cannot be accessed !!
		product2.name= "nike shoes";
		product2.price = 3000;
		product2.setPid(201);
		product2.showProductDetails();
*/
		
		//Requesting to get Mobile object constructed !!
		Mobile mobile = new Mobile(); //Parent object is constructed before child object rule to inheritance (Object to Object)
		//mobile.setProductDetails(301, "realme7", 17000); //using parent method
		//mobile.showProductDetails();
		 mobile.setProductDetails(301, "realme7", 17000, "android", 8, 128);
		 mobile.showProductDetails();
	}

}

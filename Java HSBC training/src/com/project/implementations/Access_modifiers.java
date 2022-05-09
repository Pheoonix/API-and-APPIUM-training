package com.project.implementations;

public class Access_modifiers {
public static void main(String[] args) {
	//Flight flight1;
	//System.out.println(flight1.passengers); // can't do this as passengers is private
	
	//new Access_modifiers().new Flight();
	Flight flight1 = new Access_modifiers().new Flight();
	flight1.add1Passenger();
}
public class Flight {
	private int passengers;
	private int seats;

	public Flight(){  // initializer, initializing seats and number of passengers
		seats = 100;
		passengers = 0;
	}
	public void add1Passenger() { // add passengers if seats available orelse call handleTooMany
		if(passengers<seats)
			passengers+=1;
		else
			handleTooMany();
	}
	private void handleTooMany() {
		System.out.println("Too many");
	}
}
}


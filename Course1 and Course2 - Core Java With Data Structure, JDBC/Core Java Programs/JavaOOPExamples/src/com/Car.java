package com;

public class Car {
	int wheel;
	String colour;	// string is pre defined class or reference data types.
	double price;
	
	Car() {
		System.out.println("Car object created..");
		wheel=4;
		colour="white";
		price=1000000;
	}
//	Car(int wheel1, String colour1, double price1){
//		wheel = wheel1;
//		colour=colour1;
//		price = price1;
//	}

Car(int wheel, String colour, double price){
	this.wheel = wheel;
	this.colour=colour;
	this.price = price;
}
	String findColor() {
		return "Car colour is "+colour;
	}
	void start() {
		System.out.println("Car Start");
	}
	void appliedGear() {
		System.out.println("applied gear");
	}
	void moving() {
		System.out.println("car is moving");
	}
	void stop() {
		System.out.println("car stop");
	}
	void displayCarDetails(String carName) {
		String msg="Car deails : "+carName;
		System.out.println(msg);
		System.out.println("wheel "+wheel);
		System.out.println("colour "+colour);
		System.out.println("price "+price);
	}
}

package com;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//start();
//		Car innova = new Car();			// memory create or heap memory 
//		innova.start();
//		innova.stop();
//		
//		Car ertiga = new Car();
//		ertiga.start();
//		ertiga.stop();
		
//		Car innova = new Car();
//		//innova.displayCarDetails();
//		innova.wheel=4;
//		innova.colour="White";
//		innova.price=4000000;
//		innova.displayCarDetails("Innova");
//		String carColour = innova.findColor();
//		System.out.println(carColour);
//		System.out.println("------------");
//		Car ertiga = new Car();
//		//ertiga.displayCarDetails();
//		ertiga.colour="Gray";
//		ertiga.price=1500000;
//		ertiga.wheel=4;
//		ertiga.displayCarDetails("Ertiga");
		
//		System.out.println("Constructor examples");
//		Car innova = new Car();
//		innova.displayCarDetails("innova");
		
		
		System.out.println("Parameter constructor examples");
		Car innova = new Car(4,"White",4000000);
		Car ertiga = new Car(4, "Gray", 1500000);
		innova.displayCarDetails("Innova");
		ertiga.displayCarDetails("Ertiga");
		
	}

}

package com;

public class RuntimeErrorExample {

	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=1;
	try {
	int result = a/b;
	System.out.println("Result is "+result);
	int abc[]= {10,20,30,40};
	int result1  = abc[2];
	System.out.println("Result is "+result1);
	}catch(Exception e) {
		//System.out.println("I Take Care!");
		//System.out.println(e.getMessage());   // short message of exception 
		//System.out.println(e.toString());  // name of exception as well as message 
		System.out.println(e);  // call toString method 
	}   
	
	System.out.println("Bye...");
	System.out.println("Bye...");
	System.out.println("Bye...");
	}

}

package inheritance;

import java.util.Scanner;

public class Address {
private String city;
private String state;
Scanner sc = new Scanner(System.in);

public void readAddress() {
	System.out.println("Enter the city");
	city =sc.next();
	System.out.println("Enter the state");
	state = sc.next();
}
public void displayAddress() {
	System.out.println("city is "+city);
	System.out.println("state is "+state);
}
}

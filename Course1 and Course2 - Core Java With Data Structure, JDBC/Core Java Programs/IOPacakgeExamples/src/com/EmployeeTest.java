package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//	Employee emp1 = new Employee();
//	emp1.setId(100);
//	emp1.setName("Ravi");
//	emp1.setSalary(45000);
//	
//	System.out.println(emp1);
//	
//	System.out.println("object serialization code");
//	FileOutputStream fos = new FileOutputStream("employee.ser");
//	ObjectOutputStream oos = new ObjectOutputStream(fos);
//	oos.writeObject(emp1);
//	System.out.println("objet serialization done successfully");
		
		System.out.println("Object - De-Serialization");
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp2 = (Employee)obj;
		System.out.println(emp2);
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
	}

}

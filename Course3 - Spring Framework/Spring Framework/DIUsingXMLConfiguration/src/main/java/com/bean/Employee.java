package com.bean;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;

	public Employee() {
		super();
		System.out.println("object created...with empty");
	}

	public Employee(int id, String name, float salary) {
		super();
		System.out.println("object created...with parameter");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, float salary, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void display() {
		System.out.println("Employee class display method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

package com.cg.demo.oop2;

class Employee {

	int id;
	String name;
	double salary;

	static {
		System.out.println("static block");
	}

	{
		System.out.println("non static block");
	}

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(int id, String name) {
		System.out.println("two parameterized constructor");
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, double salary) {
		System.out.println("three parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void work() {
		System.out.println("Employee works...");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

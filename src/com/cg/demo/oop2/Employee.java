package com.cg.demo.oop2;

class Employee {

	int id;
	String name;
	double salary;

	public Employee() {
		System.out.println("Constructor");
	}

	void work() {
		System.out.println("Employee works...");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

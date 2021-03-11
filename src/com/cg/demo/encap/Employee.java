package com.cg.demo.encap;

public class Employee {

	int id;
	String name;
	private double salary = 10.4;

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

}

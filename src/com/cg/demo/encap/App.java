package com.cg.demo.encap;

//encapsulation - binding data and code together - 
// - create private fields and public getters and setters 

// , inheritance, abstraction, polymorphism 

public class App {

	public static void main(String[] args) {

		Employee emp = new Employee();

		System.out.println(emp.getSalary());
		emp.setSalary(10.5);
		System.out.println(emp.getSalary());

	}

}

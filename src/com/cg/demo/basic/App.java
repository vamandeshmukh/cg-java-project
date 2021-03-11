package com.cg.demo.basic;

public class App {

	void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {

		App app = new App();
		app.m1();

		Employee emp = new Employee(101, "Sonu", 20.50);
		Employee emp2 = new Employee(101, "Sonu", 20.50);
		System.out.println(emp.toString());
		System.out.println(emp2.toString());
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.equals(emp2)); 

		Employee emp3 = new Employee(101, "Sonu", 20.50);
		Employee emp4 = emp3;
		
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		System.out.println(emp3.equals(emp4));
		
		emp3.salary = 30.75;
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		
		emp4.salary = 40.75;
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		
//		emp3 = null; // System.gc(); 
		
		System.out.println(emp3.toString());
		System.out.println(emp4.toString()); 
		
		
		
	}
}

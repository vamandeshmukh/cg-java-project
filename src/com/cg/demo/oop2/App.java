package com.cg.demo.oop2;
/** 
 * constructor 
 * - special method in Java class 
 * - it does not have have any return type 
 * - constructor name is same as class name 
 * - by default, JVM provides a default constructor 
 * - we can create one or more constructors 
 * - if we create constructors, JVM does not provide any constructor  
 *  
 */

public class App {

	public static void main(String[] args) {
		System.out.println("Start");

		Employee emp = new Employee();		
		emp.id = 101;
		emp.name = "Sonu";
		emp.salary = 10.5;
		System.out.println(emp.toString());
		
		Employee emp2 = new Employee();		
		emp2.id = 102;
		emp2.name = "Monu";
		emp2.salary = 22.45;
		System.out.println(emp2.toString());
		
		Employee emp3 = new Employee(103, "Ponu", 15.50);
		System.out.println(emp3.toString());
		
		Employee emp4 = new Employee(104, "Gonu");
		System.out.println(emp4.toString());
		

	}

}

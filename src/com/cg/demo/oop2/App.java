package com.cg.demo.oop2;
/** 
 * 
 * constructor 
 * - special method in Java class 
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
		
		emp.work();
		
		emp.id = 101;
		emp.name = "Sonu";
		emp.salary = 10.5;
		
		System.out.println(emp.toString());
		

	}

}

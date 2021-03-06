package com.cg.demo.streamdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee {
	int eid;
	String name;
	double salary;

	public Employee() {

	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class App {

	public static void main(String[] args) {

		// create a List of employees
		List<Employee> empList = new ArrayList<Employee>();

		// create employees' data to process
		empList.add(new Employee(101, "Vaman", 10000));
		empList.add(new Employee(102, "Raman", 18000));
		empList.add(new Employee(103, "Soman", 12000));
		empList.add(new Employee(104, "Suman", 15000));
		empList.add(new Employee(105, "Lakshman", 20000));

		// print the list
		System.out.println(empList);

//		for loop 
//		for each loop 

		// iterate using Iterator
		System.out.println("\nIterate using Iterator");
		Iterator<Employee> empIt = empList.iterator();
		while (empIt.hasNext()) {
			System.out.println(empIt.next().toString());
		}

		// Iterate using forEach() with anonymous inner class
		System.out.println("\nIterate using forEach() with anonymous inner class ");
		empList.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee emp) {
				System.out.println(emp.toString());
			}
		});

		// using forEach() with lambda expression
		System.out.println("\nIterate using forEach() with lambda expression");
		empList.forEach((aaa) -> {
			System.out.println(aaa.toString());
		});

		// convert List to Stream
		System.out.println("\nconvert List to Stream");
		Stream<Employee> empStream = empList.stream();

		// using collect(), convert to List
		System.out.println("\nconvert to List");
		List<Employee> convertedList = empStream.collect(Collectors.toList());

		// using filter() to get specified data
		System.out.println("\nUsing filter() to get specified data ");

		Stream<Employee> empWithMoreSal = empList.stream().filter(emp -> emp.salary > 15000);
		empWithMoreSal.forEach(emp -> System.out.println(emp.toString()));

		System.out.println("-------------");
//		empList.stream().filter(emp -> emp.salary > 15000).forEach(emp -> System.out.println(emp.toString()));
//		empList.stream().limit(4).forEach(emp -> System.out.println(emp.toString()));
//		empList.stream().skip(2).limit(2).forEach(emp -> System.out.println(emp.toString())); 
		empList.stream().filter(emp -> emp.name.charAt(0) == 'S').forEach(emp -> System.out.println(emp.toString()));

	}
}

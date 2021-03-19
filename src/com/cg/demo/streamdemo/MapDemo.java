package com.cg.demo.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

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

		// using map() to increase salary
		System.out.println("\nUsing map() to increase salary");

		List<Double> salaryHike = empList.stream()
				.map(emp -> emp.salary += 100) 
				.collect((Collectors.toList()));
		
		salaryHike.forEach(emp -> System.out.println(emp.toString()));

	}

}

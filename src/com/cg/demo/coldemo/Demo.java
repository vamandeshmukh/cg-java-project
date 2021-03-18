package com.cg.demo.coldemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Employee {

	void Employee() {
		System.out.println("Employee method");
	}

	private String name;

	public String getName() {
		return name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}

/**
 * isCharacterPresentInAllNames(Collection<Employee> entities, String
 * character):
 * 
 * 
 * Method to check if Employee list contains a name starting with a specific
 * character
 * 
 * Implement using Lambda expressions
 * 
 */

public class Demo {

	public static boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
		return false;
	}

	public static void main(final String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sonu"));
		empList.add(new Employee("Monu"));
		empList.add(new Employee("Tonu"));
		empList.add(new Employee("Somu"));

		System.out.println(empList);
		String searchChar = "S";
		boolean testResult = false;
//		testResult = empList.stream().anyMatch(() -> {
//			a.getName().startsWith(searchChar);
//		});
		System.out.println(testResult);

			
	}
}
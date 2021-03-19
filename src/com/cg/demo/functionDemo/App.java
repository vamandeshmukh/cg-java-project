package com.cg.demo.functionDemo;

import java.util.function.Predicate;

class Employee {
	public int id;
	public String name;
	public double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class App {

	public static void main(String[] args) {

		// 1. check if the employee has salary > 50000 - Predicate
		// 2. get salary + bonus (1000) = totalIncome of employee - Supplier
		// 3. Change the employee's name to upper case and print it. - Consumer
		Employee employee = new Employee(101, "Sonu", 60000);

		// using lamdba

		Predicate<Employee> predicate = (Employee) -> {
			if (employee.salary > 50000)
				return true;
			return false;
		};

//		Predicate<Double> predicate = (Double) -> {
//			if (employee.salary > 50000)
//				return true;
//			return false;
//		};

		boolean isSalaryMoreThan50K = predicate.test(employee);

		System.out.println(isSalaryMoreThan50K);

		// using anonymous inner class
		Predicate<Employee> predicate2 = new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				if (employee.salary > 50000)
					return true;
				return false;
			}
		};
		boolean isSalaryMoreThan50K2 = predicate2.test(employee);

		System.out.println(isSalaryMoreThan50K2);

	}

	public boolean getM(double salary) {
		if (salary > 50000)
			return true;
		return false;
	}
}

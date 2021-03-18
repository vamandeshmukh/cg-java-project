package com.cg.demo.cols;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1 instanceof Employee && o2 instanceof Employee) {
			if (o1.salary == o2.salary) {
				return 0;
			} else if (o1.salary > o2.salary) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0;
	}
}

public class App {

	public static void main(String[] args) {

		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		obj1.salary = 12;
		obj2.salary = 11;

		EmployeeComparator comp = new EmployeeComparator();
		System.out.println(comp.compare(obj1, obj2));

//		List<Employee> empList = new ArrayList<>();
//		empList.add(new Employee());
//		empList.add(new Employee());
//		empList.add(new Employee());

	}

}

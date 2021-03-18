package com.cg.demo.cols;

// comparable interface 

class Employee implements Comparable<Employee> {

	String name;
	double salary;

	@Override
	public int compareTo(Employee o) {
		if (o instanceof Employee) {
			if (this.salary == o.salary) {
				return 0;
			} else if (this.salary > o.salary) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0;
	}
}

public class App2 {

	public static void main(String[] args) {

	}

}

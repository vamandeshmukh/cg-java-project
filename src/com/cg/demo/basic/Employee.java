package com.cg.demo.basic;

class Employee {

	int id;
	String name;
	double salary;

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(int id, String name) {
		System.out.println("two parameterized constructor");
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, double salary) {
		System.out.println("three parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void work() {
		System.out.println("Employee works...");
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(salary);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) { 
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	} 
	
}

package com.cg.demo.pc1;

public class Employee {

	public int publicMember = 10;
	protected int protectedMember = 20;
	int packageMember = 30; // defaultMember
	private int privateMember = 40;

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.publicMember);
		System.out.println(emp.protectedMember);
		System.out.println(emp.packageMember);
		System.out.println(emp.privateMember);
	}

}

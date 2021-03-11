package com.cg.demo.pc1;

/**
 * access modifiers - 
 * public - accessible anywhere in the application 
 * protected - accessible within the package and within subclasses 
 * <package> - accessible within the package 
 * private - accessible only within the class
 */

public class App {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.publicMember);
		System.out.println(emp.protectedMember);
		System.out.println(emp.packageMember);
//		System.out.println(emp.privateMember); // private 
	}

}

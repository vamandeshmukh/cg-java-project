package com.cg.demo.reg;

/**
 * 1. if parent method does not throw any exception - then child method can not
 * throw checked exception, but can throw unchecked exception 2. if parent
 * method throws an exception - then child method can throw the same exception /
 * no exception / sub-exception
 * 
 */

class Parent {

	void m1() throws ArrayIndexOutOfBoundsException {
		System.out.println(10 / 0);
	}

//	void m1() throws RuntimeException {
//		System.out.println(10 / 0);
//	}

//	void m1() {
//		System.out.println(10 / 0);
//	}

}

class Child extends Parent {

	@Override
//	void m1() throws RuntimeException {
	void m1() throws RuntimeException {
//	void m1() {
//		try { } catch () {}
		System.out.println(10 / 0);
	}

	// @Override
//	void m1() throws InterruptedException {
//	void m1() throws ArithmeticException {
//		System.out.println(10 / 0);
//	}

}

public class App4 {

	public static void main(String[] args) {

	}

}

package com.cg.demo.reg;

public class App {

	static void m1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println("m1");
		int num = 0;
		System.out.println(10 / num); // exception
	}

	static void m2() {
		System.out.println("m2");
		try {
			m1();
		} catch (ArithmeticException ae) {
			System.out.println("exception");
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		m2();
		System.out.println("End");

	}

}

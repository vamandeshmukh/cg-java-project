package com.cg.demo.fun;

public class App3 {

	public static void main(String[] args) {

		FunIn funIn = () -> {
			System.out.println("functional method");
		};

		funIn.functionalMethod();
	}
}

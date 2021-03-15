package com.cg.demo.fun;

public class App6 {

	public static void main(String[] args) {

		FunIn obj = new FunIn() {

			@Override
			public void functionalMethod() {
				System.out.println("functionalMethod");
			}
		};
		obj.aDefaultMethod();
		obj.anotherDefaultMethod();
	}
}

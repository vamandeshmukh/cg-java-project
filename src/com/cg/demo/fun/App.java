package com.cg.demo.fun;

public class App implements FunIn {

	@Override
	public void functionalMethod() {
		System.out.println("functional method");
	}

	public static void main(String[] args) {

		App app = new App();
		// invoke functional method
		app.functionalMethod();
	}
}

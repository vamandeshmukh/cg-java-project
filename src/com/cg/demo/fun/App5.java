package com.cg.demo.fun;

class AnotherClass implements FunIn {

	@Override
	public void functionalMethod() {
		System.out.println("functionalMethod");
	}

//	@Override
//	public void aDefaultMethod() {
//		System.out.println("FunIn.aDefaultMethod();");
//	}

}

public class App5 {

	public static void main(String[] args) {

		AnotherClass obj = new AnotherClass();
		obj.aDefaultMethod();
		obj.anotherDefaultMethod();
	}
}

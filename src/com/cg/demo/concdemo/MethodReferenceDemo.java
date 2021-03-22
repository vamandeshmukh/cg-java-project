package com.cg.demo.concdemo;

/**
 * 
 * Lab 9: Lambda Expressions and Stream API -Optional Exercise 4: Write a class
 * with main method to demonstrate instance creation using method reference.
 * (Hint: Create any simple class with attributes and getters and setters)
 * 
 */

@FunctionalInterface
interface IntOne {

	public abstract void someMethod();

	public default void someOtherMethod() {
		System.out.println("someOtherMethod");
	}

}

class ClassTwo implements IntOne {

	@Override
	public void someMethod() {
		System.out.println("someMethod");
	}
}

public class MethodReferenceDemo {
	public static void main(String[] args) {

		ClassTwo classTwo = new ClassTwo();
		classTwo.someMethod();

		IntOne intOne = ClassTwo::new;
		intOne.someOtherMethod();
//		intOne.someMethod();

	}
}
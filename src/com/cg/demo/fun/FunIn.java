package com.cg.demo.fun;

@FunctionalInterface
public interface FunIn {

	public abstract void functionalMethod();

// public abstract void anotherFunctionalMethod();
//Invalid '@FunctionalInterface' annotation; FunIn is not a functional interface

	public default void aDefaultMethod() {
		System.out.println("FunIn.aDefaultMethod();");
	}

	public default void anotherDefaultMethod() {
		System.out.println("FunIn.anotherDefaultMethod();");
	}

	public static void aStaticMethod() {
		System.out.println("FunIn.aStaticMethod();");
	}

	public static void anotherStaticMethod() {
		System.out.println("FunIn.anotherStaticMethod();");
	}
}

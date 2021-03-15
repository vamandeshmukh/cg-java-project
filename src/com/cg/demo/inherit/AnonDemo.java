package com.cg.demo.inherit;

@FunctionalInterface
interface Fun {
//	int num;

	public abstract void funMethod();
//	public abstract void funMethod2();

}

class ClassOne implements Fun {

	@Override
	public void funMethod() {
		System.out.println("funMethod implemented in sub-class");
	}
}

public class AnonDemo {

	public static void main(String[] args) {

		// 1. class implements interface
//		ClassOne obj1 = new ClassOne();
		Fun obj1 = new ClassOne();
		obj1.funMethod();

		// 2. create object using anonymous inner class
		Fun obj2 = new Fun() {
			@Override
			public void funMethod() {
				System.out.println("funMethod implemented in anonymous inner class");
			}
		};
		obj2.funMethod();

		// 3. use lambda expression / lambda method 
		// syntax - obj = ( ) -> { };
		Fun obj3 = () -> {
			System.out.println("funMethod implemented in lambda expression");
		};
		obj3.funMethod();

	}
}

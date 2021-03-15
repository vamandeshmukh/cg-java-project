package com.cg.demo.inherit;

/**
 * Abstract method - 
 * It has the keyword abstract 
 * It has only signature, no body 
 * It can be defined only in an abstract class 
 * 
 * Abstract class -
 * It has the keyword abstract 
 * It can contain abstract and / or concrete methods 
 * It's object can not be created. 
 * 
 */


abstract class AbstractClass {

	abstract void abstractMethod(); // no method body 

	void concreteMethod() // What to do? 
	{					// How to do it? 
		System.out.println("concreteMethod");
	}
}

class ConcreteClass extends AbstractClass {

	@Override
	void abstractMethod() {
		System.out.println("abstractMethod has been implemented.");
	}
}

public class AbsDemo {

	public static void main(String[] args) {
		
//		AbstractClass obj = new  AbstractClass(); // Cannot instantiate the type AbstractClass 
		ConcreteClass obj = new ConcreteClass();
		obj.abstractMethod();
		
		
		
	}

}

package com.cg.demo.poly;

// polymorphism - methods with the same name work differently 
// overloading , overriding 
// method overriding - (runtime polymorphism) 
// method from a super class is overridden with a different implementation in sub-class. 
// possible in non static context 

// method overloading - (compile time polymorphism)  
// methods with the same name but with different parameters 
// possible in static / non static contexts 

class Parent {

	void m1() {
		System.out.println("m1");
	}

}

class Child extends Parent {

	@Override
	void m1() {
		System.out.println("advance m1");
	}

}

public class App {

	public static void main(String[] args) {

		Child child = new Child();
		child.m1();

	}

}


package com.cg.demo.poly;

// polymorphism - methods with the same name work differently 
// overloading , overriding 
// overriding - 
// method from a super class is overridden with a diferent implementation in sub-class. 
// possible in non static context 

// overloading - 
// methods with same name but with different parameters 
// possible in static / non static context 

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

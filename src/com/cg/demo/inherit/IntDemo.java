package com.cg.demo.inherit;

interface MyInter {

	public abstract void abs();

}

class MyClass implements MyInter {
	
	void m1() {
		System.out.println("m1");
	}

	@Override
	public void abs() {
		System.out.println("MyClass implements myInter.abs() ");
	}

}

public class IntDemo {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		obj.abs();
		obj.m1();
		
		MyInter obj2 = new MyClass();
		obj2.abs();
//		obj2.m1();
		

	}

}

package com.cg.demo.streamdemo;

class ClassOne {

	void m1() {

	}

}

class ClassTwo extends ClassOne {

	@Override
	void m1() {

	}

	void m2() {
		this.m1(); // instance members of current class 
		super.m1(); // instance members of super class 
	}

}

public class AppDemo {

}

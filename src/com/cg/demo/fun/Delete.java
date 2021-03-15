package com.cg.demo.fun;

public abstract class Delete {

	void m1() {
		//
	}

}

interface Int1 {
	void m1();

}

interface Int2 extends Int1 {
	void m2();
}

class Class3 implements Int2 {

	public static void main(String[] args) {
		Class3 obj1 = new Class3();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

interface Int3 {
	int m1();

	public default void aDefaultMethod() {
		System.out.println("Int3.aDefaultMethod();");
	}

	public static void aStaticMethod() {
		System.out.println("FunIn.aStaticMethod();");
	}

}

interface Int4 {

	public default void aDefaultMethod() {
		System.out.println("Int4.aDefaultMethod();");
	}

	public static void aStaticMethod() {
		System.out.println("FunIn.aStaticMethod();");
	}

}

class Class5 implements Int3, Int4 {

	@Override
	public void aDefaultMethod() {
		Int3.super.aDefaultMethod();
//		Int4.super.aDefaultMethod(); // 
	}

	public static void main(String[] args) {
		Class5 obj = new Class5();
		obj.m1();
		obj.aDefaultMethod();
	}

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package com.cg.demo.basic;

public class CastingDemo {

	public static void main(String[] args) {

		byte b1 = 10; // 127
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);

		System.out.println(b3);

		Object obj = new CastingDemo(); // note // 256
		CastingDemo obj2 = (CastingDemo) obj;

		int i1 = 127;
		byte b4 = (byte) i1; //
		System.out.println(b4);

	}

}

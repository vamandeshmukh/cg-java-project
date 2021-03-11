package com.cg.demo.basic;

public class RangeDemo {

	public static void main(String[] args) {

		int i1;
		byte b1;

		for (int i = -256; i <= 300; i++) {
			i1 = i;
			b1 = (byte) i1;
			System.out.println(i1 + " = " + b1);
		}

	}

}

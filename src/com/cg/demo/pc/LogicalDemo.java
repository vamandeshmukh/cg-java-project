package com.cg.demo.pc;

// logical operators && || !

public class LogicalDemo {

	public static void main(String[] args) {

		int i = 5, j = 10, k = 15;

		int ram = 6;
		int storage = 256;

		if ((ram > 4) && (storage > 128)) {
			System.out.println("select this phone");
		} else {
			System.out.println("reject");
		}

		System.out.println(i < j && j > k);

	}

}

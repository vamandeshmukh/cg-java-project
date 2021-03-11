package com.cg.demo.basic;

public class WrapperDemo {

	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);

		String s1 = "05";
		String s2 = "20";

		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = a + b;
		String s3 = Integer.toString(c);
		System.out.println(s3);
		
		Integer num = 10;
		int d = num.intValue(); 
		
		// boxing -> primitive to object (Wrapper)
		// unboxing -> object (Wrapper) to primitive 

		int num3 = 10;
		Integer num4 = Integer.valueOf(num3); // boxing 
		Integer num7 = 20; // autoboxing 
		int num5 = num4.intValue(); // unboxing 
		
		Integer num6 = new Integer(num3); 

	}

}

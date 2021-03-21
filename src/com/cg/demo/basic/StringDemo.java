package com.cg.demo.basic;

public class StringDemo {

		// SCP 
	
	public static void main(String[] args) {

		String str = "abc";
		String str2 = new String("abc");
		String str3 = str2;
		str3 = "xyz";

		System.out.println(str);
		System.out.println(str2);

		System.out.println(str.charAt(2)); // customer
		System.out.println(str.length()); // 3
		System.out.println(str.equals(str3)); // false 
		System.out.println(str == str3);
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		StringBuffer sbf = new StringBuffer("abcd");
		System.out.println(sbf);
		StringBuilder sbl = new StringBuilder("abcd");
		System.out.println(sbl);
		
		String str4 = sbf.toString();
		
		
		
		
		
		
	}

}

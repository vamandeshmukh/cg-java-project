package com.cg.demo.oop2;

import java.util.Arrays;

public class LabEx {

	String[] sortStrings(String[] str) {
		System.out.println(str);
		Arrays.sort(str);
		System.out.println(str);
		// logic 
		return null;
	}

	public static void main(String[] args) {
		LabEx obj = new LabEx();
		// String array 
		obj.sortStrings(str);

	}

}

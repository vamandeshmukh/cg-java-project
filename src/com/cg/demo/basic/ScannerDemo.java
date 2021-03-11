package com.cg.demo.basic;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter int - ");
		int i = sc.nextInt();
		System.out.println(i);
		System.out.println(System.currentTimeMillis());
		
		System.gc(); // garbage collection 
		
		
	}

}

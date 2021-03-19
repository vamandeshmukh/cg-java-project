package com.cg.demo.streamdemo;

import java.util.stream.IntStream;

public class DoubleComonDemo {

	public static void main(String[] args) {

		// using IntStream to work with int values
		System.out.println("\nUsing IntStream to work with int values");
		IntStream myInts = IntStream.of(10, 20, 30);
		// 
		myInts.forEach(System.out::println);

	}

}

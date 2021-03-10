package com.cg.demo.oop;

// types of methods 
//WAWR
//WANR 
//NAWR 
//NANR 

class Servent {

//	returnType methodName(arguments) {
//	output name (input) {processing}

	void m1() {
		System.out.println("NANR"); // Get my friend a glass of water. 
	}

	int m2() {
		System.out.println("NAWR"); // Give me a glass of water. 
		return 10;
	}

	void m3(int num) {
		System.out.println("WANR" + num); // Take this glass and keep it in kitchen. 
	}

	int m4(int num) {
		System.out.println("WAWR"); // // Take this glass, fill it and get it to me. 
		return 10 + num;
	}

}

public class MethodDemo {

	public static void main(String[] args) {
		Servent servent = new Servent();
		servent.m1();
		int value1 = servent.m2();
		System.out.println(value1);
		servent.m3(5);
		int value2 = servent.m4(5);
		System.out.println(value2);

	}

}

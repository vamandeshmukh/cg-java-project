package com.cg.demo.fun;

 
public class App2 {
 
 	public static void main(String[] args) {
 
 	FunIn funIn = new FunIn() {
 	@Override
 	public void functionalMethod() {
 	// anonymous inner class
 	System.out.println("functional method");
 	}
 	};
 	// invoke functional method
 	funIn.functionalMethod();
 	}
}


package com.cg.demo.col;

class Rodent {
	String name = "Rodent";
}

class Capybara extends Rodent {
	String name = "Rodent";
}

public class App {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = s1.toLowerCase();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		Rodent obj = new Rodent();
		Capybara cap = (Capybara) obj;
	
	}

}

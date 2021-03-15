package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

//		String input = "100";
//		System.out.println(input);
//		Pattern pattern = Pattern.compile("\\d");
//		Matcher matcher = pattern.matcher(input);
//		if (matcher.find()) {
//			System.out.println("Correct");
//		}

//		String input = "Shop,Mop,Hopping,Chopping";
//		Pattern pattern = Pattern.compile("hop");
//		Matcher matcher = pattern.matcher(input);
//		System.out.println(matcher.matches());
//		while (matcher.find()) {
//			System.out.println(matcher.group() + ": " + matcher.start() + ": " + matcher.end());
//		}

		String input = "Exo1";
		// Checks for string that start with upper case alphabet and end with digit.
		Pattern p = Pattern.compile("^[A-Z][0-9]&");
		Matcher m = p.matcher(input);
		if (!m.find()) {
			System.out.println("Enter code which start with upper case alphabet and end with a digit");
		}

	}

}

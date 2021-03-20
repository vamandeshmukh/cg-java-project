package com.cg.demo.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App {

	public static void main(String[] args) {
//		String regex = "[a-z]"; // any one char out of a-z 
//		String regex = "[a-z]+"; // any chars out of a-z 
//		String regex = "[A-Z]";
//		String regex = "[A-Z]+";
//		String regex = "[a-zA-Z]+"; // any chars out of a-z, A-Z 
//		String regex = "[\\w]+"; // any chars out of a-z, A-Z, 0-9    
//		String regex = "[a-zA-Z0-9_]+"; // any chars out of a-z, A-Z, 0-9, _   
//		String regex = "[^0-9][a-zA-Z0-9]+"; // first char can not be 0-9 
//		String regex = "[^\\d][a-zA-Z0-9]+"; // first char can not be 0-9 
		String regex = "[^\\d][\\w-.]+[@][^\\d][\\w]+[\\.][^\\d][\\w]+"; // email
//		String regex = "[a]?"; 

		Pattern pattern = Pattern.compile(regex);

		System.out.println("...");

//		String testString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String testString = "abcdefghijklmnopqrstuvwxyz";
//		String testString = "aBcZ";
//		String testString = "abCdE4826P";
//		String testString = "abCdE_4826P";
//		String testString = "0abCdE4826P";
		String testString = "a";

		Matcher matcher = pattern.matcher(testString);
		System.out.println(matcher.matches());
	}
}

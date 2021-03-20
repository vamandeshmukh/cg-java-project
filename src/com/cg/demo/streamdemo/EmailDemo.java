package com.cg.demo.streamdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDemo {

	public boolean isEmailValid(String email) {
//		String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
		String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.)*(\\.[a-zA-Z]{1,6}))?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static void main(String[] args) {

		EmailDemo emailDemo = new EmailDemo();

		String myRegex = "^([_a-zA-Z]+(\\.[0-9] @ \\.[a-zA-Z]{2,6}))$";

		String myEmail = "1vamandeshmukh@gmail.com";
		boolean emailIsValid = emailDemo.isEmailValid(myEmail);
		System.out.println(emailIsValid);

	}

}

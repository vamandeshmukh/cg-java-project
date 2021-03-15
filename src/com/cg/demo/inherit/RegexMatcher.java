package com.cg.demo.inherit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
	
	 public static void main(String[] args) {

	        String text    =
	                "This is the text to be searched " +
	                "for occurrences of the http:// pattern.";

	        String patternString = "This is the";

	        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(text);

	        System.out.println("lookingAt = " + matcher.lookingAt());
	        System.out.println("matches   = " + matcher.matches());
	    }}

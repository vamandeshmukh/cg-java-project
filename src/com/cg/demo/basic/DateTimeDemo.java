package com.cg.demo.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class DateTimeDemo {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.toLocalTime());
	}

}

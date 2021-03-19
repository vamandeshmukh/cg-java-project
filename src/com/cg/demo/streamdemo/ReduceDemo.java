package com.cg.demo.streamdemo;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();
		marks.add(96);
		marks.add(92);
		marks.add(94);
		marks.add(91);
		marks.add(95);
		System.out.println(marks);

		Integer totalMarks = marks.stream().reduce(0, (a, b) -> a + b);
		System.out.println("totalMarks " + totalMarks + "/500");

	}
}

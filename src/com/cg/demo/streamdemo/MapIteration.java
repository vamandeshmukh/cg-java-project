package com.cg.demo.streamdemo;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(10, "Ten");
		myMap.put(20, "Twenty");
		myMap.put(30, "Thirty");

		System.out.println(myMap);

		myMap.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

	}

}

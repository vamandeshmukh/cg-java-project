package com.cg.demo.coldemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class App {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);
		System.out.println(al.size());

		for (Object a : al) {
			System.out.println(a);
		}

		Vector v1 = new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());

		v1.add(10);
		v1.add(20);

		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		System.out.println(v1.size());
		System.out.println(v1.capacity());

		List list = new ArrayList();
		List list2 = new LinkedList();
		list = list2;

		List<Integer> myMarksList = new ArrayList<>();
		myMarksList.add(99);
		myMarksList.add(92);
		myMarksList.add(96);
		myMarksList.add(94);
		myMarksList.add(98);
//		myMarksList.add(95.45);
//		myMarksList.add("abc");

		Iterator<Integer> iterator = myMarksList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		List<String> myFriendsList = new ArrayList<>();
		myFriendsList.add("Sonu");
//		myFriendsList.add(10);

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(10, "Ten");
		myMap.put(20, "Twenty");
		myMap.put(30, "Thirty");
		myMap.put(40, "Fourty");
		System.out.println(myMap);

		Iterator it = myMap.entrySet().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}

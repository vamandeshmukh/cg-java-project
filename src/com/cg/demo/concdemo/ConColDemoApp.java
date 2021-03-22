package com.cg.demo.concdemo;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConColDemoApp {

	private CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

	public static void main(String[] args) {

		ConColDemoApp obj = new ConColDemoApp();
		obj.list.add(10);
		obj.list.add(20);
		obj.list.add(30);
		System.out.println(obj.list);

	}

}

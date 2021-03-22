package com.cg.demo.concdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcColDemo implements Runnable {

	private CopyOnWriteArrayList<Integer> arryList = new CopyOnWriteArrayList<>();
//	private List<Integer> arryList = new ArrayList<>();

	@Override
	public void run() {
		System.out.println("run");
		for (int i = 1; i <= 10; i++) {
			this.arryList.add(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start");
		ConcColDemo ccd = new ConcColDemo();

		Thread thread = new Thread(ccd);
		thread.start();

		for (int i = 11; i <= 20; i++) {
			ccd.arryList.add(i);
			Thread.sleep(10);
		}

		for (Integer i : ccd.arryList) {
			System.out.println(i);
		}
		System.out.println(ccd.arryList);

	}
}

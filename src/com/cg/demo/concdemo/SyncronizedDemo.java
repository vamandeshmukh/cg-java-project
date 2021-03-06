package com.cg.demo.concdemo;

public class SyncronizedDemo implements Runnable {

	private int total = 0;

	@Override
	public void run() {
		for (int i = 1; i <= 2; i++) {
			total += i;
		}
	}

	public static void main(String[] args) {
		SyncronizedDemo sync = new SyncronizedDemo();

		Thread thread = new Thread(sync);
		thread.start();
		System.out.println("Start");
		System.out.println(sync.total);
	}

//	public synchronized int getTotal() {
//		return total;
//	}
//
//	public synchronized void setTotal(int total) {
//		this.total = total;
//	}
}

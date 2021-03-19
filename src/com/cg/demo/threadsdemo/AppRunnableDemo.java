package com.cg.demo.threadsdemo;

public class AppRunnableDemo implements Runnable {

	@Override
	public void run() {
		this.printLoop();
	}

	void printLoop() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(250); // 2.5 + 2.5 = 5
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start");

		Thread threadObj = new Thread(new AppRunnableDemo());
		Thread threadObj2 = new Thread(new AppRunnableDemo());
		Thread threadObj3 = new Thread(new AppRunnableDemo());

		threadObj.start();
		threadObj.join();
		threadObj2.start();
		threadObj3.start();

	}
}

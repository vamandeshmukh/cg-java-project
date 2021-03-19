package com.cg.demo.threadsdemo;

public class App extends Thread {

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

	public static void main(String[] args) {
		System.out.println("Start");

		App obj = new App();
		App obj2 = new App();
		App obj3 = new App();
//		obj.printLoop();
//		obj2.printLoop();
		obj.start();
		obj.printLoop();
		obj2.start();
		obj3.start();
//		obj.run();
//		obj2.run();
	}
}

package com.cg.demo.syncdemo;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
	private Data load;

	// standard constructors

	public Receiver(Data load) {
		System.out.println("Receiver constructor");
		this.load = load;
	}

	public void run() {
		System.out.println("receiver run");
		for (String receivedMessage = load.receive(); !"End".equals(receivedMessage); receivedMessage = load
				.receive()) {

			System.out.println(receivedMessage);

			// ...
			try {
				System.out.println("run sleep");
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
	}
}
package com.cg.demo.syncdemo;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
	private Data data;

	// standard constructors

	public Sender(Data data) {
		System.out.println("Sender constructor");
		this.data = data;
	}

	public void run() {
		System.out.println("Sender run");
		String packets[] = { "First packet", "Second packet", "Third packet", "Fourth packet", "End" };

		for (String packet : packets) {
			data.send(packet);
			// Thread.sleep() to mimic heavy server-side processing
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
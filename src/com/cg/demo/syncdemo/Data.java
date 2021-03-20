package com.cg.demo.syncdemo;

public class Data {
	private String packet;

	// True if receiver should wait
	// False if sender should wait
	private boolean transfer = true;

	public Data() {
		System.out.println("Data constructor");
	}

	public synchronized void send(String packet) {
		System.out.println("data send");
		while (!transfer) {
			try {
				System.out.println("send wait");
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
		transfer = false;

		this.packet = packet;
		notifyAll();
	}

	public synchronized String receive() {
		System.out.println("data receive");
		while (transfer) {
			try {
				System.out.println("receive wait");
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
		transfer = true;

		notifyAll();
		return packet;
	}
}
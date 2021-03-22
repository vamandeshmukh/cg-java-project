package com.cg.demo.objdemo;

//https://stackoverflow.com/questions/2536692/a-simple-scenario-using-wait-and-notify-in-java

class MyHouse {

	private boolean pizzaArrived = false;

	public void eatPizza() throws InterruptedException {
		synchronized (this) {
			while (!pizzaArrived) {
				System.out.println("Please wait, pizza is yet to arrive...");
				wait(); // here
			}
		}
		System.out.println("Pizza is yummy!");
	}

	public void pizzaGuy() {
		synchronized (this) {
			this.pizzaArrived = true;
//			notify(); // here
			notifyAll(); // here
			System.out.println("Pizza arrived!");
		}
	}
}

class PizzaOrder implements Runnable {
	public MyHouse myHouse;

	public PizzaOrder(MyHouse myHouse) {
		super();
		this.myHouse = myHouse;
	}

	@Override
	public void run() {
		try {
			myHouse.eatPizza();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class PizzaDelivery implements Runnable {
	public MyHouse myHouse;

	public PizzaDelivery(MyHouse myHouse) {
		super();
		this.myHouse = myHouse;
	}

	@Override
	public void run() {
		myHouse.pizzaGuy();
	}
}

public class PizzaApp {

	public static void main(String[] args) {
		System.out.println("Start");
		MyHouse myHouse = new MyHouse();
		Thread order = new Thread(new PizzaOrder(myHouse));
		Thread order2 = new Thread(new PizzaOrder(myHouse));
		Thread order3 = new Thread(new PizzaOrder(myHouse));
		Thread delivery = new Thread(new PizzaDelivery(myHouse));
		order.start();
		order2.start();
		order3.start();
		delivery.start();
	}
}

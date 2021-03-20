package com.cg.demo.syncdemo;

// https://www.baeldung.com/java-wait-notify

public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		Data data = new Data();
		Thread sender = new Thread(new Sender(data));
		Thread receiver = new Thread(new Receiver(data));
		sender.start();
		receiver.start();
		System.out.println("End");
	}

}

//output -
//
//Start
//Data constructor
//Sender constructor
//Receiver constructor
//End
//Sender run
//data send
//run sleep
//receiver run
//data receive
//First packet
//run sleep
//data receive
//receive wait
//data send
//Second packet
//run sleep
//run sleep
//data receive
//receive wait
//data send
//run sleep
//Third packet
//run sleep
//data send
//run sleep
//data receive
//Fourth packet
//run sleep
//data send
//run sleep
//data receive

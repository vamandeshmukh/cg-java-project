package com.cg.demo.inherit;

// DRY - don't repeat yourself 

class Phone {

	void call() {
		System.out.println("Callling...");
	}

	void sms() {
		System.out.println("sending SMS...");
	}
}

class FeaturePhone extends Phone {

	void torch() {
		System.out.println("Flashing torch...");
	}

	void music() {
		System.out.println("Playing music...");
	}
}

public class MyPhone {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.call();
		phone.sms();

		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.call();
		featurePhone.sms();
		featurePhone.torch();
		featurePhone.music();

	}

}

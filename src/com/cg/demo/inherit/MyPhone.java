package com.cg.demo.inherit;

// DRY - don't repeat yourself 

class Phone {

	public Phone() {
		super();
		System.out.println("Phone");
	}

	void call() {
		System.out.println("Callling...");
	}

	void sms() {
		System.out.println("Sending SMS...");
	}
}

class FeaturePhone extends Phone {

	public FeaturePhone() {
		super();
		System.out.println("FeaturePhone");
	}

	void torch() {
		System.out.println("Flashing torch...");
	}

	void music() {
		System.out.println("Playing music...");
	}
}

class SmartPhone extends FeaturePhone {

	public SmartPhone() {
		super();
		System.out.println("SmartPhone");
	}

	void camera() {
		System.out.println("Taking pics...");
	}

	@Override 
	void music() {
		System.out.println("Playing dolby music...");
	}

}

public class MyPhone {

	public static void main(String[] args) {

//		Phone phone = new Phone();
//		phone.call();
//		phone.sms();
//
//		FeaturePhone featurePhone = new FeaturePhone();
//		featurePhone.call();
//		featurePhone.sms();
//		featurePhone.torch();
//		featurePhone.music();

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call();
		smartPhone.sms();
		smartPhone.torch();
		smartPhone.music();
		smartPhone.camera();

	}

}

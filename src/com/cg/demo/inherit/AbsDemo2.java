package com.cg.demo.inherit;

abstract class Rbi {

	abstract void doKyc();

}

class Hdfc extends Rbi {

	@Override
	void doKyc() {
		System.out.println("Get Aaadhaar");
	}
}

class Sbi extends Rbi {

	@Override
	void doKyc() {
		System.out.println("Get PAN Card");
	}

}

public class AbsDemo2 {

	public static void main(String[] args) {

		Hdfc hdfc = new Hdfc();
		hdfc.doKyc();
		Sbi sbi = new Sbi();
		sbi.doKyc();

	}

}

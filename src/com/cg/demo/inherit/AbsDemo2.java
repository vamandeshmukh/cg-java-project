package com.cg.demo.inherit;

abstract class Rbi {

	abstract void doKyc();

}

interface FinanceMinistry {
	abstract void payTax();

}

interface StateGovt {
	abstract void followLaborLaws();

}

class Hdfc extends Rbi implements FinanceMinistry, StateGovt {

	@Override
	void doKyc() {
		System.out.println("Get Aaadhaar");
	}

	@Override
	public void followLaborLaws() {
		System.out.println("Hdfc follows labor laws");
	}

	@Override
	public void payTax() {
		System.out.println("Hdfc pays tax");
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
		hdfc.followLaborLaws();
		hdfc.payTax();
		Sbi sbi = new Sbi();
		sbi.doKyc();
//		Rbi obj = new Hdfc(); 
//		obj.doKyc();

	}

}

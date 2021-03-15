package com.cg.demo.inherit;

abstract class Rbi {

	public Rbi() {
		super();
		System.out.println("Rbi constructor");
	}

	abstract void doKyc();

}

interface FinanceMinistry {
//	public abstract void payTax();
	void payTax(); // same as above 

}

interface StateGovt {
	public abstract void followLaborLaws();

}

class Hdfc extends Rbi implements FinanceMinistry, StateGovt {

	@Override
	void doKyc() {
		System.out.println("HDFC - Get Aaadhaar");
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

class Sbi extends Rbi implements FinanceMinistry, StateGovt {

	@Override
	void doKyc() {
		System.out.println("SBI - Get PAN Card");
	}

	@Override
	public void followLaborLaws() {
		System.out.println("SBI follows labor laws");
	}

	@Override
	public void payTax() {
		System.out.println("SBI pays tax");
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
		
//		Comparable 
//		Runnable 
//		Serializable 
		
		

	}

}

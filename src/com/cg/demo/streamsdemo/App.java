package com.cg.demo.streamsdemo;

interface In {

	static void m1() {
		//
	}

	public abstract void m2(int i);

	default void m3() {
		//
	}

}

class Class implements In {

	@Override
	public void m2(int i) {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		Class obj = new Class();
		obj.m2(1);
		obj.m3();
		In obj2 = new Class();
		obj2.m2(1);
		obj2.m3();
	}

}

class Class2 {

	public static void main(String[] args) {
		In obj = new In() {

			@Override
			public void m2(int i) {
				// TODO Auto-generated method stub

			}
		};
		obj.m2(1);
		obj.m3();
	}
}

// IntefaceName objName = (parameters) -> {method body};
// objName.methodName(arguments);

class Class3 {
	public static void main(String[] args) {
		In obj = (int i) -> {
			// code
		};
		obj.m2(1);
		obj.m3();
	}
}

public class App {

	public static void main(String[] args) {
		In.m1();

	}

}

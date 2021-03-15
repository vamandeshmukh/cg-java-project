package com.cg.demo.inherit;

class University {

	void getAdmission() {
		System.out.println("getAdmission");
	}

}

class CollegeOne extends University {

	@Override
	void getAdmission() {
		System.out.println("getAdmission in CollegeOne");
	}

}

class CollegeTwo extends University {

	@Override
	void getAdmission() {
		System.out.println("getAdmission in CollegeTwo");
	}

}

public class ObjectDemo {

	public static void main(String[] args) {
		CollegeOne student1 = new CollegeOne();
		student1.getAdmission();
//		student1 = new CollegeTwo();
//		student1 = new CollegeTwo();

		University student2 = new CollegeTwo();
		student2.getAdmission();

		University student3 = new CollegeOne(); // compare line 32
		student3.getAdmission();
//		student3 = student2; 
		student3 = new CollegeTwo();// compare line 34
		student3.getAdmission();
		student3 = new CollegeOne();

	}

}

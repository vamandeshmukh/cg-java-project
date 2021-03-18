package com.cg.demo.iodemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("emp2.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee obj2 = (Employee) ois.readObject();

		System.out.println(obj2.toString());
		ois.close();
		fis.close();

	}

}

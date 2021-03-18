package com.cg.demo.iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter - ");
		Employee obj = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println(obj.toString());

		FileOutputStream fos = new FileOutputStream("emp2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();
		sc.close();
	}

}

// Employee [id=101, name=Sonu, salary=10.5]

package com.cg.demo.niodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {

		Path filePath = Paths.get("myFile.txt");
		InputStream is = Files.newInputStream(filePath);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		System.out.println(br.readLine());
		br.close();
		isr.close();
		is.close();

	}

}

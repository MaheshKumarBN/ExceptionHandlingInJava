package com.berry.exceptionhandling.throws_keyword;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
	}
}

//CE: Unreported exception java.io.FileNotFoundException must be caught or declared to be thrown

class Test1 {
	public static void main(String[] args) {
		Thread.sleep(1000);
		System.out.println("Hello");
	}
}

//CE: Unreported exception java.io.InterruptedException must be caught or declared to be thrown

//Approaches for below classes

//1. Using throws
class Test_Approach {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");	
		pw.println("Hello");
		pw.close();
	}
}

//2. Using try-catch
class Test1_Approach {
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
package com.berry.exceptionhandling.checked_exception;

import java.io.FileNotFoundException;

//Note: check this code in command prompt
import java.io.PrintWriter;

public class Example1 {
	public static void main(String[] args) throws FileNotFoundException {	//remove throws will get following exception 
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
		pw.close();
	}
}

/*	Terminal Error
 * Test.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
 * PrintWriter pw = new PrintWriter("abc.txt");  
 * 					^
 */
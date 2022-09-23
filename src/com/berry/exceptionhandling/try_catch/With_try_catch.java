package com.berry.exceptionhandling.try_catch;

public class With_try_catch {
	public static void main(String[] args) {
		System.out.println("Statement-1");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println(10/2);
		}
		System.out.println("Statement-2");
	}
} 

//output
//------
//
//Statement-1
//5
//Statement-2
//
//Normal Termination
//Gracefull termination

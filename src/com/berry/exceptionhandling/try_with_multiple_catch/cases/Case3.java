package com.berry.exceptionhandling.try_with_multiple_catch.cases;

public class Case3 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}

//output
//------

// Arithmetic Exception

//No Compile time error

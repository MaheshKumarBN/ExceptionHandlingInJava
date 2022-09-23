package com.berry.exceptionhandling.try_catch_finally.cases;

public class Case2 {
	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		System.out.println("outside try_catch_finally");
	}
}

//output
//------

//try
//catch
//finally
//outside try_catch_finally

//Normal termination
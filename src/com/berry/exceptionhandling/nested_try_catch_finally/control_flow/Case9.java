package com.berry.exceptionhandling.nested_try_catch_finally.control_flow;

//If an exception raised at Statement-8 and corresponding catch block matched
public class Case9 {
	public static void main(String[] args) {
		try {
			System.out.println("Statement-1");
			System.out.println("Statement-2");
			System.out.println("Statement-3");
			try {
				System.out.println("Statement-4");
				System.out.println("Statement-5");
				System.out.println("Statement-6");
			} catch (Exception e) {
				System.out.println("Statement-7");
			} finally {
				System.out.println(10/0);
			}
			System.out.println("Statement-9");
		} catch (ArithmeticException e) {
			System.out.println("Statement-10");
		} finally {
			System.out.println("Statement-11");
		}
		System.out.println("Statement-12");
	}
}

//output
//------

//Statement-1
//Statement-2
//Statement-3
//Statement-4
//Statement-5
//Statement-6
//Statement-10
//Statement-11
//Statement-12

//Normal Termination

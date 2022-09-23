package com.berry.exceptionhandling.try_catch_finally.control_flow;

//if exception occurs in statement-2 and corresponding catch block matched
public class Case2 {
	public static void main(String[] args) {
		try {
			System.out.println("Statement-1");
			System.out.println("Statement-2: " +10/0);
			System.out.println("Statement-3");
		} catch (ArithmeticException e) {
			System.out.println("Statement-4: "+10/2);
		} finally {
			System.out.println("Statement-5");
		}
		System.out.println("Statement-6");
	}
}

//output
//------

//Statement-1
//Statement-4: 5
//Statement-5
//Statement-6

//Normal Termination

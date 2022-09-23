package com.berry.exceptionhandling.try_catch_finally.control_flow;

//if exception occurs in statement-4 and corresponding catch block not matched
public class Case4 {
	public static void main(String[] args) {
		try {
			System.out.println("Statement-1");
			System.out.println("Statement-2: " +10/0);
			System.out.println("Statement-3");
		} catch (ArithmeticException e) {
			System.out.println("Statement-4: "+10/0);
		} finally {
			System.out.println("Statement-5");
		}
		System.out.println("Statement-6");
	}
}

//output
//------

//Statement-1
//Statement-5
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.try_catch_finally.control_flow.Case4.main(Case4.java:11)

//Abnormal Termination

package com.berry.exceptionhandling.try_catch_finally.control_flow;

//if exception occurs in statement-4 and corresponding catch block not matched
public class Case5 {
	public static void main(String[] args) {
		try {
			System.out.println("Statement-1");
			System.out.println("Statement-2");
			System.out.println("Statement-3");
		} catch (ArithmeticException e) {
			System.out.println("Statement-4");
		} finally {
			System.out.println("Statement-5: "+10/0);
		}
		System.out.println("Statement-6");
	}
}

//output
//------

//Statement-1
//Statement-2
//Statement-3
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.try_catch_finally.control_flow.Case5.main(Case5.java:13)

//Abnormal Termination

//Note: if an Exception Occurs out side the try block then it is always Abnormal Termination

package com.berry.exceptionhandling.nested_try_catch_finally.control_flow;

//If an exception raised at Statement-11 or Statement-12
public class Case14 {
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
				System.out.println("Statement-8");
			}
			System.out.println("Statement-9");
		} catch (Exception e) {
			System.out.println("Statement-10");
		} finally {
			System.out.println(10/0);
		}
		System.out.println(10/0);
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
//Statement-8
//Statement-9
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.nested_try_catch_finally.control_flow.Case14.main(Case14.java:23)

//Abnormal Termination

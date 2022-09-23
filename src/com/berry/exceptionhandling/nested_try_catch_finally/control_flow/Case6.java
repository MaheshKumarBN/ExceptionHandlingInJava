package com.berry.exceptionhandling.nested_try_catch_finally.control_flow;

//If an exception raised at Statement-5 and both inner catch block and
//outer catch block not matched
public class Case6 {
	public static void main(String[] args) {
		try {
			System.out.println("Statement-1");
			System.out.println("Statement-2");
			System.out.println("Statement-3");
			try {
				System.out.println("Statement-4");
				System.out.println(10 / 0);
				System.out.println("Statement-6");
			} catch (NullPointerException e) {
				System.out.println("Statement-7");
			} finally {
				System.out.println("Statement-8");
			}
			System.out.println("Statement-9");
		} catch (NullPointerException e) {
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
//Statement-8
//Statement-11
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.nested_try_catch_finally.control_flow.Case6.main(Case6.java:13)



//Abnormal Termination

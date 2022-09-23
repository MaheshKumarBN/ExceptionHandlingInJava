package com.berry.exceptionhandling.try_catch_finally.cases;

public class Case3 {
	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.out.println(10/0);
		} catch (NullPointerException e) {
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
//finally
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.try_catch_finally.cases.Case3.main(Case3.java:7)

//Abnormal termination
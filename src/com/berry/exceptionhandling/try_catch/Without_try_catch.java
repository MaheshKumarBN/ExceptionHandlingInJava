package com.berry.exceptionhandling.try_catch;

public class Without_try_catch {
	public static void main(String[] args) {
		System.out.println("Statement-1");
		System.out.println(10/0);
		System.out.println("Statement-2");
	}
}

//output
//------
//Statement-1
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.try_catch.Without_try_catch.main(Without_try_catch.java:6)
//	
//	Abnormal Termination, Non-Gracefull
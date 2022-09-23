package com.berry.exceptionhandling.top_10_exceptions_or_errors;

public class ExceptionInInitializerError_1 {
	static int x = 10 / 0;

	public static void main(String[] args) {

	}

}

class ExceptionInInitializerError_2 {
	static {
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String[] args) {

	}
}

//console
//-------

//Exception in thread "main" java.lang.ExceptionInInitializerError
//Caused by: java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.top_10_exceptions_or_errors.ExceptionInInitializerError_1.<clinit>(ExceptionInInitializerError_1.java:4)


//Exception in thread "main" java.lang.ExceptionInInitializerError
//Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
//	at com.berry.exceptionhandling.top_10_exceptions_or_errors.ExceptionInInitializerError_2.<clinit>(ExceptionInInitializerError_1.java:15)

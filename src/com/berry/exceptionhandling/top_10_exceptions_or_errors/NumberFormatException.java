package com.berry.exceptionhandling.top_10_exceptions_or_errors;

public class NumberFormatException {
	public static void main(String[] args) {
		int i = Integer.parseInt("10");
		System.out.println(i);
		
		int i1 = Integer.parseInt("b");
		System.out.println(i1);
	}
}

//console
//-------

//10
//Exception in thread "main" java.lang.NumberFormatException: For input string: "b"
//	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//	at java.base/java.lang.Integer.parseInt(Integer.java:668)
//	at java.base/java.lang.Integer.parseInt(Integer.java:784)
//	at com.berry.exceptionhandling.top_10_exceptions_or_errors.NumberFormatException.main(NumberFormatException.java:8)


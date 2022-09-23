package com.berry.exceptionhandling.top_10_exceptions_or_errors;

public class NullPointerException {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String s = "Hello";
		String s1 = null;
		System.out.println(s.length());
		System.out.println(s1.length());
	}
}

//console
//-------

//5
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s1" is null
//	at com.berry.exceptionhandling.top_10_exceptions_or_errors.NullPointerException.main(NullPointerException.java:9)


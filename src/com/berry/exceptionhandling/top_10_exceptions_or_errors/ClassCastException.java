package com.berry.exceptionhandling.top_10_exceptions_or_errors;

public class ClassCastException {
	public static void main(String[] args) {
		String s = "hello";
		Object o = s;
		System.out.println(o);
		
		Object o2 = new String("java");
		String s2 = (String)o2;
		System.out.println(s2);
		
		Object o1 = new Object();
		String s1 = (String)o1;
		System.out.println(s1);
	}
}

//console
//-------

//hello
//java
//Exception in thread "main" java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
//	at com.berry.exceptionhandling.top_10_exceptions_or_errors.ClassCastException.main(ClassCastException.java:14)

package com.berry.exceptionhandling.top_10_exceptions_or_errors;

public class IllegalArgumentException {
	public static void main(String[] args) {
		Thread t = new Thread();
		t.setPriority(6);
		t.setPriority(10);
		t.setPriority(11);	// thread priority ranges from 1 - 10
	}
}

//console
//-------

//Exception in thread "main" java.lang.IllegalArgumentException
//at java.base/java.lang.Thread.setPriority(Thread.java:1138)
//at com.berry.exceptionhandling.top_10_exceptions_or_errors.IllegalArgumentException.main(IllegalArgumentException.java:8)

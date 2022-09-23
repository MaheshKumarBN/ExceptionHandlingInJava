package com.berry.exceptionhandling.top_10_exceptions_or_errors;

public class StackOverFlowError {
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		m2();
	} 
	public static void m2() {
		m1();
	}
}

//console
//-------

//at com.berry.exceptionhandling.top_10_exceptions_or_errors.StackOverFlowError.m2(StackOverFlowError.java:11)
//at com.berry.exceptionhandling.top_10_exceptions_or_errors.StackOverFlowError.m1(StackOverFlowError.java:8)
//at com.berry.exceptionhandling.top_10_exceptions_or_errors.StackOverFlowError.m2(StackOverFlowError.java:11)
//at com.berry.exceptionhandling.top_10_exceptions_or_errors.StackOverFlowError.m1(StackOverFlowError.java:8) ...

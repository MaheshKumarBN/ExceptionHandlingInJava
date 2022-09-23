package com.berry.exceptionhandling.try_catch.controlflow;

// if exception raised at statement-2 & corresponding catch block not matched
public class Case3 {
	public static void main(String[] args) {
		try {
			System.out.println("Statement-1");
			System.out.println("Statement-2 :"+10/0);
			System.out.println("Statement-3");
		} catch (NullPointerException e) {
			System.out.println("Statement-4: "+10/2);
		}
		System.out.println("Statement-5");
	} 
}

//output
//------
//Statement-1
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.try_catch.controlflow.Case3.main(Case3.java:8)

//Abnormal termination
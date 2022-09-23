package com.berry.exceptionhandling.try_with_multiple_catch.cases;

public class Case1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("Exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithemetic Exception");
		}
	}
}

//output
//------
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
//
//	at com.berry.exceptionhandling.try_with_multiple_catch.cases.Case1.main(Case1.java:9)

//compile time error

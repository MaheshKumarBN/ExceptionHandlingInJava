package com.berry.exceptionhandling.try_with_multiple_catch.cases;

public class Case2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception-1");
		} catch (ArithemeticException e) {
			System.out.println("Arithemetic Exception-2");
		}
	}
}

//output
//------

//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	ArithemeticException cannot be resolved to a type
//
//	at com.berry.exceptionhandling.try_with_multiple_catch.cases.Case2.main(Case2.java:9)

// Compile time error

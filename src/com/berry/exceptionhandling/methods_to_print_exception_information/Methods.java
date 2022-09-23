package com.berry.exceptionhandling.methods_to_print_exception_information;

public class Methods {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}

//output
//------
//
//e.printStacktrace()
//java.lang.ArithmeticException: / by zero
//at com.berry.exceptionhandling.methods_to_print_exception_information.Methods.main(Methods.java:6)

//Format
//Name of Exception: Description
//	stackTrace

//---------------------------------------------------------------------------------------------------

//System.out.println(e.toString());
//or System.out.println(e);
//java.lang.ArithmeticException: / by zero

//Format
//Name of Exception: Description

//---------------------------------------------------------------------------------------------------

//	System.out.println(e.getMessage());
// / by zero

//Format
//Description

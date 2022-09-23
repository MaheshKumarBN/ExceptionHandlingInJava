package com.berry.exceptionhandling.try_catch_finally.cases;

public class Case1 {
	public static void main(String[] args) {
		try {
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		System.out.println("outside try_catch_finally");
	}
}

//output
//------

//try
//finally
//outside try_catch_finally

//Normal termination
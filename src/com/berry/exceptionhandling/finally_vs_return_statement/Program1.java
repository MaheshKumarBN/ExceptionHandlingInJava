package com.berry.exceptionhandling.finally_vs_return_statement;

public class Program1 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	
	private static int m1(){
		try {
			System.out.println("try");
			return 100;
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		return 0;
	}
}

//output
//------

//try
//finally
//100

//Explanation: if there is a return statement in try block, first JVM will 
//execute finally block if exist and then returns the value

//Note: Here finally block dominates return statement 
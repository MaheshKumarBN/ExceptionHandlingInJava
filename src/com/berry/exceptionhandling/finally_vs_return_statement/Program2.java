package com.berry.exceptionhandling.finally_vs_return_statement;

public class Program2 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	
	@SuppressWarnings("finally")
	private static int m1(){
		try {
			System.out.println("try");
			return 100;
		} catch (Exception e) {
			System.out.println("catch");
			return 200;
		} finally {
			System.out.println("finally");
			return 300;
		}
	}
}

//output
//------

//try
//finally
//300

//Explanation: if there is a return statement in try, catch and finally block, first JVM will 
//execute finally block and consider finally block returned object or value.\

//Note: Here finally block dominates return statement
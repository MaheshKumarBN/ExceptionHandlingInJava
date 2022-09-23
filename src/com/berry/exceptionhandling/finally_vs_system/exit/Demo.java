package com.berry.exceptionhandling.finally_vs_system.exit;

public class Demo {
	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.out.println("Hello");
			System.out.println("World");
			System.exit(0);
		} catch(Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}

//output
//------

//try
//Hello
//World

//Note: Here System.exit(0) dominates the finally block or this is the only case where finally block will not be executed

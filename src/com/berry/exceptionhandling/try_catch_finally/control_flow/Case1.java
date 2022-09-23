package com.berry.exceptionhandling.try_catch_finally.control_flow;

//if no exception occurs
public class Case1 {
	public static void main(String[] args) {
		try {
			System.out.println("Statement-1");
			System.out.println("Statement-2");
			System.out.println("Statement-3");
		} catch (Exception e) {
			System.out.println("Statement-4");
		} finally {
			System.out.println("Statement-5");
		}
		System.out.println("Statement-6");
	}
}

//output
//------

//Statement-1
//Statement-2
//Statement-3
//Statement-5
//Statement-6

//Normal Termination

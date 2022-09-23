package com.berry.exceptionhandling.nested_try_catch_finally;

//if inner catch block is having NPE
public class Demo2 {
	public static void main(String[] args) {
		try {
			System.out.println("Outer try");
			try {
				System.out.println("Inner try");
				System.out.println(10/0);
			} catch (NullPointerException e) {
				System.out.println("Inner catch");
			}
			System.out.println("Out of Inner try_catch block");
		} catch (Exception e) {
			System.out.println("Outer catch");
		} finally {
			System.out.println("Outer finally");
		}
	}
}

//output
//------

//Outer try
//Inner try
//Outer catch
//Outer finally



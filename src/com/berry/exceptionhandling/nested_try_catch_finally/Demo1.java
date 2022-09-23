package com.berry.exceptionhandling.nested_try_catch_finally;

//if inner catch block handles inner try block 
public class Demo1 {
	public static void main(String[] args) {
		try {
			System.out.println("Outer try");
			try {
				System.out.println("Inner try");
				System.out.println(10/0);
			} catch (ArithmeticException e) {
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
//Inner catch
//Out of Inner try_catch block
//Outer finally



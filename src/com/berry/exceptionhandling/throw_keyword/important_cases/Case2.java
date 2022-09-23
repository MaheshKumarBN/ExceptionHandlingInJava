package com.berry.exceptionhandling.throw_keyword.important_cases;

import java.util.Scanner;

public class Case2 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println(10/0);
			System.out.println("Hello");
		}
		case 2:{
			throw new ArithmeticException("/ by zero");
			System.out.println("Hello");
		}
		}
	}
}

//console
//-------

//case1 : Runtime Exception
//Enter your choice
//1
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.throw_keyword.important_cases.Case2.main(Case2.java:14)

//case2 : Compile time Error
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	Unreachable code

//	at com.berry.exceptionhandling.throw_keyword.important_cases.Case2.main(Case2.java:19)


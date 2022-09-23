package com.berry.exceptionhandling.throw_keyword.important_cases;

import java.util.Scanner;

public class Case1 {
	private static Scanner sc;
	private static ArithmeticException ae = new ArithmeticException();
	private static ArrayIndexOutOfBoundsException a;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			throw ae;
		}
		case 2:{
			throw a;
		}
		}
	}
}

//console
//-------

//case1 : ArithmeticException
//Enter your choice
//1
//Exception in thread "main" java.lang.ArithmeticException
//	at com.berry.exceptionhandling.throw_keyword.important_cases.Case1.<clinit>(Case1.java:7)

//case2 : NullPointerException
//Enter your choice
//2
//Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "com.berry.exceptionhandling.throw_keyword.important_cases.Case1.a" is null
//	at com.berry.exceptionhandling.throw_keyword.important_cases.Case1.main(Case1.java:19)

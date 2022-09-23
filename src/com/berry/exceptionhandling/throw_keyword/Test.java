package com.berry.exceptionhandling.throw_keyword;

import java.util.Scanner;

public class Test {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println("Without throw");
			System.out.println(10/0);
		}
		case 2:{
			System.out.println("With throw");
			throw new ArithmeticException();
		}
		}
	}
}

//console
//-------

//Enter your choice
//1
//Without throw
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.berry.exceptionhandling.throw_keyword.Test.main(Test.java:15)


//Enter your choice
//2
//With throw
//Exception in thread "main" java.lang.ArithmeticException
//	at com.berry.exceptionhandling.throw_keyword.Test.main(Test.java:19)


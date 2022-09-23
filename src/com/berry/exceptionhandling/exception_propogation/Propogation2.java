package com.berry.exceptionhandling.exception_propogation;

public class Propogation2 {
	public static void main(String[] args) {
		m1();
		System.out.println("I'm main()");
	}

	private static void m1() {
		m2();
		System.out.println("I'm m1()");
	}

	private static void m2() {
		System.out.println(10/0);
		System.out.println("I'm m2()");
	}
	
}

package com.berry.exceptionhandling.nested_try_catch_finally.various_combinations;

import java.util.Scanner;

public class AllInOne {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Valid cases");
			System.out.println("Type-1");
			try {

			} catch (Exception e) {

			}

			System.out.println("Type-2");
			try {

			} catch (ArithmeticException e) {

			} catch (NullPointerException e) {

			}

			System.out.println("Type-3");
			try {

			} catch (Exception e) {

			} finally {

			}

			System.out.println("Type-4");
			try {

			} catch (Exception e) {

			}
			try {

			} catch (Exception e) {

			}

			System.out.println("Type-5");
			try {

			} finally {

			}

			System.out.println("Type-6");
			try {

			} catch (ArithmeticException e) {

			} catch (NullPointerException e) {

			} finally {

			}

			System.out.println("Type-7");
			try {
				try {

				} catch (ArithmeticException e) {

				}
			} catch (NullPointerException e) {

			}

			System.out.println("Type-8");
			try {
				try {

				} catch (Exception e) {

				}
			} catch (Exception e) {

			}

			System.out.println("Type-9");
			try {

			} catch (Exception e) {
				try {

				} catch (Exception e2) {

				}
			}

			System.out.println("Type-10");
			try {

			} catch (Exception e) {

			} finally {
				try {

				} catch (Exception e2) {

				} finally {

				}
			}
		}
		case 2: {
			System.out.println("Invalid cases");
			System.out.println("Type-1");
			try {
				
			} catch (Exception e) {
			
			} catch (Exception e) {

			}
			
			System.out.println("Type-2");
			try {
				
			}
			
			System.out.println("Type-3");
			catch (Exception e) {

			}
			
			System.out.println("Type-4");
			finally {
				
			}
			
			System.out.println("Type-5");
			try {
				
			} finally {

			} catch (Exception e) {

			}
			
			System.out.println("Type-6");
			try {
				
			} try {
				
			} catch (Exception e) {

			} finally {
				
			}
			
			System.out.println("Type-7");
			try {
				
			} catch (Exception e) {

			} finally {
				
			} finally {
				
			}
			
			System.out.println("Type-8");
			try {
				
			} 
			System.out.println("Hello");
			catch (Exception e) {

			}
			
			System.out.println("Type-9");
			try {
				
			} catch (Exception e) {
			
			}
			System.out.println("Hello");
			catch (Exception e) {
				
			}
			
			System.out.println("Type-10");
			try {
				
			} catch (Exception e) {

			}
			System.out.println("Hello");
			finally {
				
			}
			
			System.out.println("Type-11");
			try {
				try {
					
				}
			} catch (Exception e) {

			}
			
			System.out.println("Type-12");
			try
				System.out.println("try");
			catch (Exception e) 
				System.out.println("catch");
					
			System.out.println("Type-13");
			try {
				
			} catch (Exception e2) 
				System.out.println("catch");
			
			try {
				
			} catch (Exception e3) {

			} finally 
				System.out.println("finally");
		}
		}
	}
}

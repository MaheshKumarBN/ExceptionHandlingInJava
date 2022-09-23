package com.berry.exceptionhandling.features;

public class MultiCatchBlock {
	public static void main(String[] args) {

		// 1.6V
		try {

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			e.getMessage();
		}

		// 1.7V
		try {

		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		// Not Allowed in 1.7 and other versions
//		try {
//
//		} catch (ArithmeticException | RuntimeException e) {
//			e.printStackTrace();
//		}
		//Compile time Error
		// The exception ArithmeticException is already caught by the alternative
		// RuntimeExceptionThe exception ArithmeticException is already caught by the
		// alternative RuntimeException
	}
}

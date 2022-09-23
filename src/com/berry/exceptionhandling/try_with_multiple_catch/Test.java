package com.berry.exceptionhandling.try_with_multiple_catch;

public class Test {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		} catch(ArithmeticException e) {
			System.out.println(10/2);
		} catch (NullPointerException e) {
			System.out.println("Use Local File");
		} catch (Exception e) {
			System.out.println("Generic Handler");
		}
	}
}

//output
//------

//As we can line-6 throws ArithemeticException and is handled in first catch block
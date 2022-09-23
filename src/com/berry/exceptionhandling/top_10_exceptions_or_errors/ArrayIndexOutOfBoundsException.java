package com.berry.exceptionhandling.top_10_exceptions_or_errors;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 7, 9 };
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println(arr[5]);
	}
}

//console
//-------

//4
//7
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//	at com.berry.exceptionhandling.top_10_exceptions_or_errors.ArrayIndexOutOfBoundsException.main(ArrayIndexOutOfBoundsException.java:8)

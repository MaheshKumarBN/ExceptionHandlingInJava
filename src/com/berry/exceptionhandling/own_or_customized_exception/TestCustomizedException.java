package com.berry.exceptionhandling.own_or_customized_exception;

import java.util.Scanner;

public class TestCustomizedException {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();

		if (age < 18) {
			throw new TooYoungException("You are not applicable for Marriage until you reach 18");
		} else if(age > 60){
			throw new TooYoungException("You are not applicable for Marriage as you crossed your marriage limit 60");
		} else {
			System.out.println("Registration Success!");
		}

	}
}

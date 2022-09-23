package com.berry.exceptionhandling.checked_exception;

//Note: check this code in command prompt
public class Example2 {
	public static void main(String[] args) throws InterruptedException {	//remove throws will get following exception
		System.out.println("I want to sleep happily");
		Thread.sleep(1000);
	}
}
/*
* Test2.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
* Thread.sleep(1000);
*            ^
*/
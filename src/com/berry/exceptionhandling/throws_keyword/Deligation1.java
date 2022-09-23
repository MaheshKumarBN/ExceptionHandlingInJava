package com.berry.exceptionhandling.throws_keyword;

public class Deligation1 {
	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}
	
	private static void doStuff() {
		doMoreStuff();
	}

	private static void doMoreStuff() {
		Thread.sleep(1000);
	}
}

//CE: 
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//Unhandled exception type InterruptedException

//Explanation: Here exception occurred at line 11, because if main thread 
//enters sleeping state then there might be chances of interruption 
//from other threads, Since doMoreStuff() did not deligate Exception 
//to its caller, so here we will get compile time error at line-13
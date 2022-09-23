package com.berry.exceptionhandling.throws_keyword;

public class Deligation3 {
	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}

	private static void doStuff() throws InterruptedException{
		doMoreStuff();
	}

	private static void doMoreStuff() throws InterruptedException{
		Thread.sleep(1000);
	}
}

//CE: 
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//Unhandled exception type InterruptedException

//Explanation: Here exception occurred at line 11, because if main thread 
//enters sleeping state then there might be chances of interruption 
//from other threads, Since doMoreStuff() deligate Exception 
//to its caller and doStuff() is deligating Exception to its caller main(),
//and main method is deligatinng Exception to its caller, since JVM is 
//responsible for calling main method, JVM internally handles the Exception. 
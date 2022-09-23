package com.berry.exceptionhandling.throws_keyword.important_cases;

public class Case3_1 {
	public static void main(String[] args) {
		throw new Exception();	// checked type
	}
}

//CE: unreported exception Exception; must be caught or declared to be thrown

class Case3_2 {
	public static void main(String[] args) {
		throw new Error();	//unchecked type
	}
}

//Exception in thread "main" java.lang.Error
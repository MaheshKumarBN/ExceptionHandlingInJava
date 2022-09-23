package com.berry.exceptionhandling.throws_keyword.important_cases;

public class Case1 /*throws Exception*/{ //here Invalid: because class cannot be called
	Case1() throws Exception{ //Valid: because class can be called
		
	}
	static void m1() throws Exception{ //Valid: because class can be called
		
	}
}

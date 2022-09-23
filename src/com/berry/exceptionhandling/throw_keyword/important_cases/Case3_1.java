package com.berry.exceptionhandling.throw_keyword.important_cases;

public class Case3_1 {
	public static void main(String[] args) {
		throw new Case3_1();
	}
}

class Case3_2 extends RuntimeException {
	public static void main(String[] args) {
		throw new Case3_2();
	}
}

//console
//-------

//case3_1 : Compile time Error
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	No exception of type Case3_1 can be thrown; an exception type must be a subclass of Throwable

//	at com.berry.exceptionhandling.throw_keyword.important_cases.Case3_1.main(Case3_1.java:5)


//case3_2 : Runtime Exception
//Exception in thread "main" com.berry.exceptionhandling.throw_keyword.important_cases.Case3_2
//at com.berry.exceptionhandling.throw_keyword.important_cases.Case3_2.main(Case3_1.java:11)


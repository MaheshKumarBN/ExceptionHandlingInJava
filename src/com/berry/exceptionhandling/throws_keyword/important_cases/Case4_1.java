package com.berry.exceptionhandling.throws_keyword.important_cases;

import java.io.IOException;

public class Case4_1 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (ArithmeticException e) {	//unchecked
			
		}
	}
}
 
//Valid

class Case4_2 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (Exception e) {	//Partially checked
			
		}
	}
}

//Valid
class Case4_3 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (IOException e) {	//fully checked
			
		}
	}
}

//Invalid CE: Exception IOException is never thrown in corresponding try block

class Case4_4 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (InterruptedException e) {	//fully checked
			
		}
	}
}

//Invalid CE: Exception InterruptedException is never thrown in corresponding try block

class Case4_5 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (Error e) {	// unchecked
			
		}
	}
}

//Invalid


//Conclusion: When ever we try to catch fully checked Exception in catch block compile time error occurs
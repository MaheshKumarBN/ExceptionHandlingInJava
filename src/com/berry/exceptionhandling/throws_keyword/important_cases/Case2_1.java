package com.berry.exceptionhandling.throws_keyword.important_cases;

public class Case2_1 {
	public static void main(String[] args) throws Case2_1{
		
	}
}

//CE: Incompatible types: Test cannot be converted to Throwable

class Case2_2 extends Throwable/*(or Exception or RuntimeException)*/{
	public static void main(String[] args) throws Case2_2{
		
	}
}

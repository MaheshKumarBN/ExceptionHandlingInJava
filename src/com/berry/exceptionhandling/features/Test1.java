package com.berry.exceptionhandling.features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Version 1.6
public class Test1 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("abc.txt"));
			// based on requirement we use br to read data.
		} catch (IOException e) {
			// handling code
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// handling code
				}
			}
		}
	}
}
//Drawback of 1.6v
//----------------

//1. code complexity.
//2. length of code increases.
//3. readability decreases.

//Version 1.7
class Test2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
			// based on requirement we use br to read data.
			// Once control reaches the end of try block br will automatically be closed, we
			// are not required to close explicitly
		} catch (IOException e) {
			// handling code
		}
	}
}

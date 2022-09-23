package com.berry.exceptionhandling.features;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Conclusion {
	public static void main(String[] args) {

		// 1. we can use multiple resources
		try (FileReader fr = new FileReader("abc.txt"); PrintWriter pw = new PrintWriter("xyz.txt")) {
			// usage of fr and pw done here.
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. A Resource is said to be AutoClosable when it implements AutoClosable(I)
		// check all Resource classes like PrintWriter, FileReader etc
		// PrintWriter extends Writer, Writer implements Closable, Closable extends
		// AutoClosable

		// 3. All Resource reference variables are implicitly final
		try (FileReader fr1 = new FileReader("abc.txt")) {
			// fr1 = new FileReader("lmn.txt");
		} catch (IOException e) {
			// Handling code...
		}
		// Compile-time Error: The resource fr1 of a try-with-resources statement cannot
		// be assigned.

		// 4. Until 1.6v try should be followed with catch or finally block, from 1.7v
		// only try block can be used as all resources will be closed before the end of
		// try block
		//1.7v
//		FileReader fr3 = new FileReader("input.txt");
//		try(fr3) {
			//not allowed in 1.7v
//		}
		
//		try(FileReader fr4 = new FileReader("input.txt")) {
			//allowed in 1.7v
//		}
		
		//1.9v
//		FileReader fr5 = new FileReader("input.txt");
//		try(fr5) {
			//allowed in 1.9v
//		}
	}
}

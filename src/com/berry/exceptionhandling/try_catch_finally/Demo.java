package com.berry.exceptionhandling.try_catch_finally;

// Specialty of finally block is whether the Exception is
// raised, not raised, handled or not handled finally block will execute

// why finally: to deallocate code or maintain clean up code 
public class Demo {
	public static void main(String[] args) {
		try {
			// Open DB connection
			// Read data
		} catch (Exception e) {
			// if Exception occurs in Open Connection or Read data handling code written
			// here
		} finally {
			// Close DB Connection
		}
	}
}

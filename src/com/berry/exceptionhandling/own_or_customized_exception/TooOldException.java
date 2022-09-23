package com.berry.exceptionhandling.own_or_customized_exception;

@SuppressWarnings("serial")
public class TooOldException extends RuntimeException{
	public TooOldException(String message) {
		super(message);
	}
}

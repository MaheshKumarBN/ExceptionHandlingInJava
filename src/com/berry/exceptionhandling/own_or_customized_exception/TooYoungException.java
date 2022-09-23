package com.berry.exceptionhandling.own_or_customized_exception;

@SuppressWarnings("serial")
public class TooYoungException extends RuntimeException {

	public TooYoungException(String message) {
		super(message);
	}
}

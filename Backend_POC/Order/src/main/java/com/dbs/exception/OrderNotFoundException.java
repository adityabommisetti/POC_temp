package com.dbs.exception;

public class OrderNotFoundException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6877261291015502071L;

	public OrderNotFoundException() {
		super();
	}

	public OrderNotFoundException(String message) {
		super(message);
	}

	public OrderNotFoundException(String message, Throwable cause) {
		super(message);
	}

	public OrderNotFoundException(Throwable cause) {
		super(cause);
	}
}

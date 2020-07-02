package com.dbs.exception;

public class ApplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3567948334158087020L;

	public ApplicationException() {
		super();
	}

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(Throwable cause, String message) {
		super(message, cause);
	}

	public ApplicationException(Throwable cause) {
		super(cause);
	}

}

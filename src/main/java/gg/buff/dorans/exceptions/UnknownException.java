package gg.buff.dorans.exceptions;

public class UnknownException extends DoransException {
	private final static String MESSAGE = "Unknown exception";

	public UnknownException() {
		super(MESSAGE);
	}

	public UnknownException(Throwable cause) {
		super(MESSAGE, cause);
	}
}

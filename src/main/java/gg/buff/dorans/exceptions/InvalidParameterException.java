package gg.buff.dorans.exceptions;

public class InvalidParameterException extends DoransRuntimeException {
	private final static String MESSAGE = "Invalid Parameter";

	public InvalidParameterException() {
		super(MESSAGE);
	}

	public InvalidParameterException(Throwable cause) {
		super(MESSAGE, cause);
	}

	public InvalidParameterException(String message) {
		super(String.format("%s: %s", MESSAGE, message));
	}

	public InvalidParameterException(String message, Throwable cause) {
		super(String.format("%s: %s", MESSAGE, message), cause);
	}
}

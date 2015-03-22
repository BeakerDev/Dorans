package gg.buff.dorans.exceptions;

public class BadRequestException extends DoransException {
	private final static String MESSAGE = "Bad Request";

	public BadRequestException() {
		super(MESSAGE);
	}

	public BadRequestException(Throwable cause) {
		super(MESSAGE, cause);
	}
}

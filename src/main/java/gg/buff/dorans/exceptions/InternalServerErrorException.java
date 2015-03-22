package gg.buff.dorans.exceptions;

public class InternalServerErrorException extends DoransException {
	private final static String MESSAGE = "An internal server error has occurred";

	public InternalServerErrorException() {
		super(MESSAGE);
	}

	public InternalServerErrorException(Throwable cause) {
		super(MESSAGE, cause);
	}
}

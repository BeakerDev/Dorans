package gg.buff.dorans.exceptions;

public class UnauthorizedException extends DoransException {
	private final static String MESSAGE = "Unauthorized Request";

	public UnauthorizedException() {
		super(MESSAGE);
	}

	public UnauthorizedException(Throwable cause) {
		super(MESSAGE, cause);
	}
}

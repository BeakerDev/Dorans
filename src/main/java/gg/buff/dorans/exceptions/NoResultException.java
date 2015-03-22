package gg.buff.dorans.exceptions;

public class NoResultException extends DoransException {
	private final static String MESSAGE = "No Result for the given parameters";

	public NoResultException() {
		super(MESSAGE);
	}

	public NoResultException(Throwable cause) {
		super(MESSAGE, cause);
	}
}

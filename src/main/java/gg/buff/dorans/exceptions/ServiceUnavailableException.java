package gg.buff.dorans.exceptions;

public class ServiceUnavailableException extends DoransException {
	private final static String MESSAGE = "Currently cannot connect to the API";

	public ServiceUnavailableException() {
		super(MESSAGE);
	}

	public ServiceUnavailableException(Throwable cause) {
		super(MESSAGE, cause);
	}
}

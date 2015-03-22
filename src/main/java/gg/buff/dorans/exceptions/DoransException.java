package gg.buff.dorans.exceptions;

public class DoransException extends Exception {
	public DoransException() {
		super();
	}

	public DoransException(String message) {
		super(message);
	}

	public DoransException(String message, Throwable cause) {
		super(message, cause);
	}

	public DoransException(Throwable cause) {
		super(cause);
	}
}

package gg.buff.dorans.exceptions;

public class DoransRuntimeException extends RuntimeException {
	public DoransRuntimeException() {
		super();
	}

	public DoransRuntimeException(String message) {
		super(message);
	}

	public DoransRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public DoransRuntimeException(Throwable cause) {
		super(cause);
	}
}

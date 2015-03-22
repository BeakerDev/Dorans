package gg.buff.dorans.exceptions;

public class RateLimitExceededException extends DoransException {
	private final static String MESSAGE = "API rate limit exceeded";

	public RateLimitExceededException() {
		super(MESSAGE);
	}

	public RateLimitExceededException(Throwable cause) {
		super(MESSAGE, cause);
	}
}

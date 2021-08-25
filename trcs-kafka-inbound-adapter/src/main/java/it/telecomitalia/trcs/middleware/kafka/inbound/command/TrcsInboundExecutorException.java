package it.telecomitalia.trcs.middleware.kafka.inbound.command;

public class TrcsInboundExecutorException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TrcsInboundExecutorException(Throwable cause) {
		super(cause);
	}
}

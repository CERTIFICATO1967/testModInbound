package it.telecomitalia.trcs.middleware.kafka.inbound.command;

import java.util.Map;

/**
 * Interfaccia per il pattern command per l'elaborazione degli eventi ricevuti da kafka
 * 
 * @author danlanzi
 *
 */
public interface TrcsInboundExecutor {

	public void execute(Map<String, Object> headers, String payload) throws ExecutorSynchronousFailed ;
}

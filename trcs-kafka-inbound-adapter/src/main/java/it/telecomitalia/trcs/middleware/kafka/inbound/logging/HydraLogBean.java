package it.telecomitalia.trcs.middleware.kafka.inbound.logging;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;

@JsonInclude(Include.NON_EMPTY)
public class HydraLogBean {

	@JsonProperty("sorgente")
	private String source;
	
	@JsonProperty("destinazione")
	private String target;
	
	@JsonProperty("canale_di_provenienza")
	private String channel;
	
	@JsonProperty("id_univoco")
	private String transactionId;
	
	@JsonProperty("servizio_applicativo")
	private String service;
	
	@JsonProperty("tipo_Evento")
	private String eventType;
	
	@JsonProperty("return_code_Evento")
	private Result result;
	
	@JsonProperty("evento")
	private EventBean event = new HydraLogBean.EventBean();
	
	@JsonProperty("tempo_di_esecuzione")
	private long elapsed;
	
	public static enum Result {
		success,
		failure,
		retry,
		discard
	};
	
	public static class EventBean extends KafkaMessageBean {
		
		@JsonProperty("failureResponse")
		private KafkaMessageBean response;

		public KafkaMessageBean getResponse() {
			return response;
		}

		public void setResponse(KafkaMessageBean response) {
			this.response = response;
		}
		
	}
	
	
	public static class KafkaMessageBean {
		private Map<String, String> header;
		
		private Object payload;

		public Map<String, String> getHeader() {
			return header;
		}

		public void setHeader(Map<String, Object> header) {
			this.header = new HashMap<>();
			
			for (String key: header.keySet()) {
				if (!key.startsWith("kafka_")) {
					this.header.put(key, TrcsKafkaHeader.objectToString(header.get(key)));
				}
			}
		}
		
		public void setStringHeader(Map<String, String> header) {
			this.header = new HashMap<>();
			
			for (String key: header.keySet()) {
				if (!key.startsWith("kafka_")) {
					this.header.put(key, header.get(key));
				}
			}
		}
		

		public Object getPayload() {
			return payload;
		}

		public void setPayload(Object payload) {
			this.payload = payload;
		}
		
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public EventBean getEvent() {
		return event;
	}

	public void setEvent(EventBean event) {
		this.event = event;
	}

	public long getElapsed() {
		return elapsed;
	}

	public void setElapsed(long elapsed) {
		this.elapsed = elapsed;
	};
	
	

}

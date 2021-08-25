package it.telecomitalia.middleware.ws.client.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXIbData;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXRequest;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXRequest.IbData;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXResponse;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

@SpringBootApplication(scanBasePackages={"it.telecomitalia.trcs.middleware"})
public class ConsumingWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(OpscProvisioningClient client) {
		return args -> {

			SetSubscriberStatusXRequest request = new SetSubscriberStatusXRequest();
			
			request.setIbRetCode("0");
			request.setIbAppDep1("0");
			request.setIbAppDep2("0");
			request.setIbIdSrvc("TESTER");
			request.setIbData(new IbData());
			SetSubscriberStatusXIbData payload = new SetSubscriberStatusXIbData();
			request.getIbData().setRequest(payload);

			payload.setClientKeys(new SetSubscriberStatusXIbData.ClientKeys());
			payload.getClientKeys().setMSISDN("1234567");
			payload.setTransaction(new SetSubscriberStatusXIbData.Transaction());
			payload.getTransaction().setSubsystem("SUBSYS-0001");
			payload.getTransaction().setTID("123456");
			
			payload.setOperation(new SetSubscriberStatusXIbData.Operation());
			payload.getOperation().setOperationType("ASTMgr");
			payload.getOperation().setASTMgr(new SetSubscriberStatusXIbData.Operation.ASTMgr());
			payload.getOperation().getASTMgr().setOperationType("block");
			payload.getOperation().getASTMgr().setClient(new SetSubscriberStatusXIbData.Operation.ASTMgr.Client());
			payload.getOperation().getASTMgr().getClient().setReason("boh");
			
			payload.setRequestType("");
			payload.setResponseType("");
			
			request.getIbData().setIbLenData(0);
/*
			String country = "Spain";

			if (args.length > 0) {
				country = args[0];
			}
*/
			HeaderType header = new HeaderType();
			header.setTransactionID("TID-0001");
			header.setBusinessID("BID-0001");
			header.setMessageID("MID-0001");
			header.setSourceSystem("SOURCE-0001");
			
			SetSubscriberStatusXResponse response = client.setSubscriberStatusX(header, request);

			System.err.println("Result: " + response.getIbRetCode());

		};
	}

}

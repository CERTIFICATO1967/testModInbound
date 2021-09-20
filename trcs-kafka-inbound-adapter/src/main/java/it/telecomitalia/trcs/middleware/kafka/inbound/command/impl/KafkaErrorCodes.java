package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

public class KafkaErrorCodes {

	public static String decodeFromOpsc(String ibRetCode) {
		switch (ibRetCode) {
		case "-604": 
		case "-620":
		case "-622":
		case "-623":
			return "PP001";

		case "-617":
			return "PP002";

		case "-13":
			return "PP003";

		case "-626":
			return "PP004";

		case "-28":
			return "PP005";

		case "-12":
			return "PP008";

		case "-29":
			return "PP013";

		case "-609":
			return "PP016";

		case "-22":
			return "PP017";

		case "-23":
			return "PP018";

		default:
			if ((ibRetCode.startsWith("-4")) && (ibRetCode.length()==4))
				return "PP035";
			else
				return "PP999"; 

		}

	}

	public static String messageFromOpsc(String ibRetCode) {
		switch (ibRetCode) {
		case "-604": 
		case "-620":
		case "-622":
		case "-623":
			return "Messaggio di input non corretto.";

		case "-617":
			return "TimeOut su OCS.";

		case "-13":
			return "Linea non trovata su OCS.";

		case "-626":
			return "Offerta non trovata nel catalogo del GATEWAY.";

		case "-28":
			return "Linea già in stato di LOCK GW.";

		case "-12":
			return "Operazione fallita su OCS.";

		case "-29":
			return "Stato linea non valido.";

		case "-609":
			return "Operazione non consentita";

		case "-22":
			return "Transazione OCS ancora in corso per il TID in oggetto.";

		case "-23":
			return "Linea già presente in base dati.";

		default:
			if ((ibRetCode.startsWith("-4")) && (ibRetCode.length()==4))
				return "Errore in fase di provisioning.";
			else
				return "Errore generico interno GW."; 

		}
	}

	public static String decodeFromGino(String code) {
		return "PP"+code;
	}

	public static String messageFromGino(String code) {
		switch (code) {
			case "001":
				return "Messaggio di input non corretto";
				
			case "002":
				return "TimeOut su OCS.";
			
			case "003":
				return "Linea non trovata su OCS.";
				
			case "004":
				return "Offerta non trovata nel catalogo del GATEWAY.";
				
			case "005":
				return "Linea già in stato di LOCK GW.";
				
			case "006":
				return "Codice lingua non trovato.";
				
			case "007":
				return "Componente dell'offerta non trovato nel catalogo del GATEWAY.";
				
			case "008":
				return "Operazione fallita su OCS.";
				
			case "009":
				return "Basket non attivo per il subscriber.";
				
			case "010":
				return "Offerta non attiva per il subscriber.";
			
			case "011":
				return "Codice di riconfigurazione linea non trovato.";
				
			case "012":
				return "Valore non consentito per la modalità di pagamento.";
				
			case "013":
				return "Stato linea non valido.";
				
			case "015":
				return "Dato inatteso ricevuto da OCS.";
				
			case "016":
				return "Operazione non consentita";
				
			case "017":
				return "Transazione OCS ancora in corso per il TID in oggetto.";
				
			case "018":
				return "Linea già presente in base dati.";

			case "019":
				return "Errore in fase di provisioning.";
				
			default:
				return "Errore generico interno GW.";
		}
	}

}

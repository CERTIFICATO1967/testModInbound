package it.telecomitalia.trcs.gateway.services.opsc.util;

import java.io.StringWriter;

public class ProvisioningOpscUtil {

	public static String removeLeftZero(String value) {
		// Se il valore passato e' nullo o e' lungo massimo un carattere
		if ((value==null) || (value.length()<2)) 
			return value;
		
		//SONAR si fa il trim su se stesso
		value = value.trim();
		
		String result = value;
		
		for (int i=0; i<value.length(); i++) {
			if (value.charAt(i)!='0') {
				result = value.substring(i);
				return result;
			}
		}
		
		if (value.length()>0)
			result="0";

		return result;
	}
	
}

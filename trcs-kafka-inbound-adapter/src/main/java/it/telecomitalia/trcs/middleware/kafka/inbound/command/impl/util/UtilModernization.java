package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;



public class UtilModernization {
	
	public static String ConvertDateGregToString(XMLGregorianCalendar dateToConvert) {
		if(dateToConvert==null)
			return null;
		String dateConvert=dateToConvert.toString().replace("T", "").replace(":", "").replace("-", "");

		//return dateConvert;
		return dateConvert.substring(0, 14);
	}

	public static XMLGregorianCalendar localDateTime2XMLGregorianCalendar(LocalDateTime pField) throws DatatypeConfigurationException {
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(pField.toString());
		
	}
	
	 public static LocalDateTime toLocalDateTime(XMLGregorianCalendar calendar) {
	        if (calendar != null) {
	            ZonedDateTime zonedDateTime = calendar.toGregorianCalendar()
	                    .toZonedDateTime();
	            return ZonedDateTime.ofInstant(zonedDateTime.toInstant(),ZoneId.systemDefault()).toLocalDateTime();
	        }
	        return null;
	    }
	
	
	
	

	
}


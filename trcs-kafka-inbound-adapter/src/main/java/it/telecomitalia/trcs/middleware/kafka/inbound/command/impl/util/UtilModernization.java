package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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


	public static XMLGregorianCalendar string2XMLGregorianCalendar(String pField) throws ParseException, DatatypeConfigurationException {
		DateFormat df = new SimpleDateFormat("yyyyMMDDHHmmss");
		GregorianCalendar lGregorianCalendarObj = new GregorianCalendar();
		Date lDateObj = df.parse(pField);
		lGregorianCalendarObj.setTimeInMillis(lDateObj.getTime());

		return DatatypeFactory.newInstance().newXMLGregorianCalendar(lGregorianCalendarObj);
	}
}


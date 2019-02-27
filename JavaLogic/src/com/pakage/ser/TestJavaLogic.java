package com.pakage.ser;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJavaLogic {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String dateStr = "21/20/2011";
        
        DateFormat srcDf = new SimpleDateFormat("dd/MM/yyyy");
         
        // parse the date string into Date object
        Date date = srcDf.parse(dateStr);
         
        DateFormat destDf = new SimpleDateFormat("MM-dd-yyyy");
          
        // format the date into another format
        dateStr = destDf.format(date);
         
        System.out.println("Converted date is : " + dateStr);

	}

}

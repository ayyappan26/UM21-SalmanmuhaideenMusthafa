package com.ultramain.date;
import java.text.SimpleDateFormat;
import java.util.Date;




public class DateEntering {
	public static void main(String[] args) {
		Date newDate = new Date();
		SimpleDateFormat simpleformat = new SimpleDateFormat("MM-DD-YYYY");
		String str = simpleformat.format(newDate);
		System.out.println(newDate);
		
	}
	

}

package com.example.demo.htinsharHelperClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	public static Date changeStringToDesiredDate(String dateInput)  {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date desiredDate;
		try {
			desiredDate = simpleDateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			desiredDate = null;
		}
		return desiredDate;
	}
}

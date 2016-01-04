package net.batkin.springBootTest.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date getDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.clear();;
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		return cal.getTime();
	}
}

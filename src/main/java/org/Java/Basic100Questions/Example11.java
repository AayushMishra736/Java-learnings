package org.Java.Basic100Questions;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Example11 {

    public static void main(String[] args) {
        long millies = System.currentTimeMillis();
        Date date = new Date(millies);
        System.out.println(date);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int year = gregorianCalendar.get(Calendar.YEAR);
        int hours = gregorianCalendar.get(Calendar.HOUR);
        int second = gregorianCalendar.get(Calendar.SECOND);
        int minute = gregorianCalendar.get(Calendar.MINUTE);
        System.out.println(day + ":" + month+":"+year+":"+hours+":"+second+":"+minute);

        System.out.println("Simple date formate...");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String dateFormate  = simpleDateFormat.format(date);
        System.out.println(" dateFormate : " + dateFormate);

    }
}

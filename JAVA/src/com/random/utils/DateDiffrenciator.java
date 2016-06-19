package nonweb.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDiffrenciator
{
    public static void main(String[] args)
    {
      /*  String date1 = "6/26/2008 3:21:45 PM";
        String date2 = "6/25/2008 3:21:45 PM";
        DateFormat myDateFormat =
            new SimpleDateFormat("mm/dd/yyyy hh:mm:ss aa");
        Date myDate1 = null;
        Date myDate2 = null;
        try
        {
            myDate1 = myDateFormat.parse(date1);
            myDate2 = myDateFormat.parse(date2);
        }
        catch (java.text.ParseException e)
        {
            e.printStackTrace();
        }
        
     
        Calendar c1 = Calendar.getInstance();
        c1.setTime(myDate1);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(myDate2);
        System.out.println("Diffrence in hour"
            + (c2.getTimeInMillis() - c1.getTimeInMillis()) / 1000 / 60 / 60);*/
        String str = "MM/dd/yyyy";
        DateFormat dateFormat = null;
        try
        {
            dateFormat = new SimpleDateFormat(str);
            
                System.out.println("" + dateFormat.format(("11/02/1984")));
           
        }
        catch (IllegalArgumentException e) {
           System.out.println("ILLEGAL ARGUMENT");
        }
        System.out.println(((SimpleDateFormat) dateFormat).toPattern());
        /*DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println(timeFormat.format(date));*/
    }
}
package com.LelinStam.customTags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HolidayTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        JspWriter out = getJspContext().getOut();
        out.println(getDate());
    }

    private String getDate() {
        Calendar today = GregorianCalendar.getInstance();
        Calendar newYear = new GregorianCalendar();
        newYear.set(2018, Calendar.JANUARY, 01);

        Calendar christmas = new GregorianCalendar();
        christmas.set(2018, Calendar.DECEMBER, 25);

        Calendar halloween = new GregorianCalendar();
        halloween.set(2018, Calendar.OCTOBER, 31);

        Calendar valentines = new GregorianCalendar();
        valentines.set(2018, Calendar.FEBRUARY, 14);

        if(today.equals(newYear)) {
            return "Happy New Year's Day!";
        } else if(today.equals(christmas)) {
         return "Merry Christmas!";
         } else if(today.equals(halloween)){
         return "Happy Halloween";
         } else if(today.equals(valentines)) {
             return "Valentine's Day <3";
         }else {
            return "no Holidays today";
         }
    }
}

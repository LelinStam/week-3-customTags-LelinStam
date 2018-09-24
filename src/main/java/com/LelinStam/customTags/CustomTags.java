package com.LelinStam.customTags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;

public class CustomTags extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        JspWriter out = getJspContext().getOut();
        out.println(getTime());

    }

    private String getTime() {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12) {
            return "Good Morning";
        }else if(timeOfDay >=12 || timeOfDay <=16){
            return "Good Afternoon";
        }else if(timeOfDay >=16 || timeOfDay <=21){
            return "Good Evening";
        }else if(timeOfDay >=21 || timeOfDay <=24){
            return "Good Night";
        }
        return "";
    }
}

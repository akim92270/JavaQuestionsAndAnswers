package date_practices;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate); //Sat Apr 30 10:13:49 CDT 2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Today is = " + sdf.format(currentDate));


        //Print date in the format of Sat hh:mm PM

        sdf = new SimpleDateFormat("EEE hh:mm a");
        System.out.println(sdf.format(currentDate));


        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));

    }
}

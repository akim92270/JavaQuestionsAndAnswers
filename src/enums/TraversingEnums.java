package enums;

import java.time.Month;

public class TraversingEnums {
    //For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.

    public static void main(String[] args) {

        for(Day day : Day.values()){
            System.out.println(day);
        }

        //Traverse Months
        for(Constants.Months month : Constants.Months.values()){
            System.out.println(month);
        }
    }
}

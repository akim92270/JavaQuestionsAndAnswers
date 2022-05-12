package enums;

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

        //Traverse TShirtSize
        for(Constants.TShirtSize TShirtSize : Constants.TShirtSize.values()){
            System.out.println(TShirtSize);
        }

        //Traverse Level
        for(Constants.Level Level : Constants.Level.values()){
            System.out.println(Level);
        }

        //Traverse Frequencies
        for(Constants.Frequencies Frequencies : Constants.Frequencies.values()){
            System.out.println(Frequencies);
        }
    }
}

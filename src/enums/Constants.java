package enums;

public class Constants {

    //Enums are used with Constants ex: Gender, TShirtSizes, Level, Months, Frequencies

    public enum Gender{
        FEMALE,
        MALE,
    }

    public enum TShirtSize{
        SMALL,
        MEDIUM,
        LARGE,
        X_LARGE
    }

    public enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public enum Months{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public enum Frequencies{
        HOURLY,
        DAILY,
        WEEKLY,
        BI_WEEKLY,
        MONTHLY,
        YEARLY
    }
}

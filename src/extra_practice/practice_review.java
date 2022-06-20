package extra_practice;

public class practice_review {
    public static void main(String[] args) {
        String s1 = "5", s2 = "10";

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
        System.out.println(Integer.parseInt(s1) * Integer.parseInt(s2));
        System.out.println(Integer.parseInt(s1) / Integer.parseInt(s2));
        System.out.println(Integer.parseInt(s1) - Integer.parseInt(s2));
        System.out.println(Integer.parseInt(s1) % Integer.parseInt(s2));

        String s3 = "200", s4 = "-50";
        System.out.println("The greatest value is = " + Math.max(Integer.parseInt(s3),Integer.parseInt(s4)));

        double day = .96;
        System.out.println((int)24 / day + " days");
    }
}

package mathClass;

public class FindAbsolute {
    public static void main(String[] args) {

        char c = (char) Math.abs(6-10);
        char b = 4;

        int abs = Math.abs(6-10+4+1+65-34*9/7);
        //int abs2 = Math.abs(5,7); not gonna work because it's not 1 number

        System.out.println(abs);

        int x = 53;
        int y = 34;

        System.out.println(Math.abs(x-y));

        //2,3,4,5,6,7,8,9,10

        int givenNumber = 11;
        System.out.println(Math.abs(6-givenNumber) <= 4);

    }
}

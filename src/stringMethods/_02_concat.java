package stringMethods;

public class _02_concat {
    public static void main(String[] args) {
        /*
        Method Task: It is used to combine multiple strings and forms a new one
        -It is non-static, and we can call it an object created
        -Return type method, and returns a new String
        -It takes a String as an argument
         */

        String s1 = "Tech"; // String object
        String s2 = "Global"; //String object

        String s3 = s1.concat(s2); //String s3 = s1 + s2;
        System.out.println(s3);

        System.out.println(s3.concat(" School")); //TechGlobal School

        System.out.println("Hello".concat(" World!")); //Hello World!
        System.out.println("Hello".concat(" ").concat("World")); //Hello World!
        System.out.println("Hello".concat(" ") + "World"); //Hello World!

    }
}

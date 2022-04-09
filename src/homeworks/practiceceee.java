package homeworks;

public class practiceceee {
    public static void main(String[] args) {

        System.out.println("\n-------------count spaces---------\n");
        String str1 = "123 Java, JavaScript, C# 456";

        int total = 0;
        String str4 = str1.trim();
        for (int i = 0; i <= str4.length()-1; i++) {
            if(str4.contains(" "))
                if(str4.charAt(i) == ' ') total++;
        }
        System.out.println(total);


        System.out.println("\n-------------count words---------\n");
        String str = "Hello my name is Abe";

        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            if(str.contains(" "))
                if(str.charAt(i) == ' ') count++;
        }
        System.out.println(count);

        System.out.println("\n-------------reverse string multiple lines---------\n");
        String str3 = "Hello";
        for (int i = str3.length()-1; i >= 0; i--) {
            System.out.println(str3.charAt(i));
        }

        System.out.println("\n-------------count letters---------\n");
        int count1 = 0;
        String str7 = "123 Java, JavaScript, C# 456";
        for (int i = 0; i < str7.length(); i++) {
            if(str7.charAt(i) >= 65 && str7.charAt(i) <= 90 || str7.charAt(i) >= 97 && str7.charAt(i) <= 122)
                count1++;
        }
        System.out.println(count1);

        System.out.println("\n----------------------\n");
    }
}

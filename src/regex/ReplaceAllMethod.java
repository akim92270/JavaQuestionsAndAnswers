package regex;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        //Removing vowels
        String str = "Hello World";
        System.out.println("Before: " + str);

        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("After: " + str);

        //removing digits

        String str2 = "hello123world";
        str2 = str2.replaceAll("[0-9]","");
        System.out.println(str2);

        /*
        Create a String as below:
        String str = “How much wood would a wood-Chuck chuck if a wood-chuck could chuck wood”;
        Replace all wood with “****”
        Expected output: How much **** would a ****-Chuck chuck if a ****-chuck could chuck ****
         */

        String str3 = "How much wood would a wood-Chuck chuck if a wood-chuck could chuck wood";
        System.out.println(str3.replaceAll("wood", "****"));

        /*Create a String as below:
        String str = “ abc 123 $#^ ”;
        Remove all special characters
        Expected output: abc123
         */

        String str4 = "abc 123 $#^ ";
        String str5 = " aAc 123 $#^%   )(! ";
        str5 = str5.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str5);

    }
}

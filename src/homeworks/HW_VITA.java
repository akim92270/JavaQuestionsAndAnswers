package homeworks;

public class HW_VITA {
    public static void main(String[] args) {
        /*
        Write a program to find the all duplicates in a String array, ignore cases.
        It should print "There is no duplicates" if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given String array.
         */
        String[] words4 = {"A", "foo", "12", "Fo", "bar", "m", "a", "java"};
        String dup = "";
        for (int i = 0; i < words4.length - 1; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if ((words4[i].equalsIgnoreCase(words4[j]) && (!dup.contains(String.valueOf(words4[j]))))) {
                    dup += words4[j];
                    System.out.println(words4[j]);
                    break;
                }
            }
        }
        if (dup.isEmpty()) System.out.println("There is no duplicates");

        System.out.println("Trying boolean flag");

        boolean isEqual = false;
        for (int i = 0; i < words4.length - 1; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if (words4[i].equalsIgnoreCase(words4[j])) {
                    System.out.println(words4[j]);
                    isEqual = true;
                    break;
                }
            }
        }
        if (!isEqual) System.out.println("There is no duplicates");

    }
}

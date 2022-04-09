package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {

        String str = "TechGlobal School";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') sum++;
        }
        System.out.println(sum);
    }
}

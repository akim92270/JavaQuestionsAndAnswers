package loops.forLoop;

import utilities.ScannerHelper;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {


        int a = ScannerHelper.getNumberFromUser();
        for (int i = 0; i <= a; i++) {
            if (!(i % 2 == 0) && i < a)
                System.out.println(i);
        }
    }
}

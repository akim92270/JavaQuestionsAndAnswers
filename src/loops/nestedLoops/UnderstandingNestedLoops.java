package loops.nestedLoops;

public class UnderstandingNestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Group " + i);

            for (int j = 1; j <= 3 ; j++) {
                System.out.println("\tClassmates " + j);

            }


        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Group " + i);

            for (int j = 1; j <= 3; j++) {
                System.out.println("\tClassmates " + j);
            }
        }
    }
}

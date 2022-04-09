package oop_principles.recapOOP;

public class CreatingSwords {
    public static void main(String[] args) {
        CurvedSword goldenSword = new CurvedSword();
        goldenSword.color = "Yellow";
        goldenSword.material = "Gold";
        goldenSword.sharpness = "Blunt";
        goldenSword.price = 500.0;
        goldenSword.weight = 15.5;

        CurvedSword ironSword = new CurvedSword("Silver", "Iron", "Sharp", 7.3, 50.0);

        System.out.println(goldenSword + "\n" + ironSword);

        goldenSword.slash();
        goldenSword.cut();
        goldenSword.cut(goldenSword.sharpness.equals("Sharp"));

        ironSword.slash();
        ironSword.cut();
        ironSword.cut(ironSword.sharpness.equals("Sharp"));
    }
}
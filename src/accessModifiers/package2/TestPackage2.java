package accessModifiers.package2;

import accessModifiers.package1.Honda;
//import accessModifiers.package1.Tesla;

public class TestPackage2 {
    public static void main(String[] args) {
        Honda h1 = new Honda();
        //Tesla t1 = new Tesla(); compiler error because Tesla is default


    }
}

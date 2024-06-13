package Intermediate1.nested.test;

import Intermediate1.nested.nested.ShadowingMain;

public class OuterClassMain2 {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass  = outerClass2.new InnerClass();

        innerClass.hello();
    }
}

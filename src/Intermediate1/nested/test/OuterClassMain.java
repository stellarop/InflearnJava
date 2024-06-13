package Intermediate1.nested.test;

import Intermediate1.nested.nested.ShadowingMain;

public class OuterClassMain {
    public static void main(String[] args) {

        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();

        nestedClass.hello();
    }
}

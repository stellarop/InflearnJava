package Intermediate2.generic.test.ex3;

import Intermediate2.generic.test.ex3.unit.Marine;
import Intermediate2.generic.test.ex3.unit.Zealot;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린", 40);
        Marine m2 = new Marine("짐레이너", 200);

        Marine marine = UnitUtil.maxHp(m1, m2);
        System.out.println("marine : " + marine);

        Zealot z1 = new Zealot("질럿", 160);
        Zealot z2 = new Zealot("피닉스", 480);
        Zealot zealot = UnitUtil.maxHp(z1, z2);
        System.out.println("zealot : " + zealot);
    }
}

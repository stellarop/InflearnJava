package Intermediate2.generic.test.ex3;

import Intermediate2.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t){
        // 제네릭 타입은 BioUnit 하위라고 명시했기 때문에 BioUnit 하위에 있는 모든 타입 저장 가능
        T unit = t.out();
        System.out.println("제네릭 메서드");
        System.out.println("이름 : " + unit.getName() + " hp : " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t){
        // 와일드카드는 지정한 타입(BioUnit)만 저장 가능하다.
        BioUnit unit = t.out();
        System.out.println("와일드카드");
        System.out.println("이름 : " + unit.getName() + " hp : " + unit.getHp());
    }
}

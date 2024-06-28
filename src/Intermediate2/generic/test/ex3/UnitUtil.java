package Intermediate2.generic.test.ex3;

import Intermediate2.generic.test.ex3.unit.BioUnit;
public class UnitUtil{

    // 메서드에 제네릭 타입 지정( BioUnit 클래스에 있는 메서드를 적용해야 되기 때문)
    public static <T extends BioUnit> T maxHp(T t1, T t2){
        if(t1.getHp() > t2.getHp()){
            return t1;
        }
        return t2;
    }
}

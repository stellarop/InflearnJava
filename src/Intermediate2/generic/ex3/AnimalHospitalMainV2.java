package Intermediate2.generic.ex3;

import Intermediate2.generic.animal.Cat;
import Intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHisV2<Dog> dog = new AnimalHisV2();
        AnimalHisV2<Cat> cat = new AnimalHisV2();
        // 제네릭을 사용하면 모든 타입을 지정할 수 있기 때문에 Animal 타입과 무관한 타입도 사용 가능하다
        AnimalHisV2<Integer> integer = new AnimalHisV2();
        AnimalHisV2<Object> object = new AnimalHisV2();

    }
}

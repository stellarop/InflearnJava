package Intermediate2.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        // 다음 항목이 없을때까지 반복
        while (iterator.hasNext()){
            // iterator.next() 메서드는 해당 배열의 값을 리턴한다
            System.out.println(iterator.next());
        }

        System.out.println("forEach 사용");

        // Iterator 인터페이스를 구현한 객체에 대해서 향상된 for 문을 제공한다
        for (int value : myArray) {
            System.out.println(value);
        }

        // 위 두 코드는 같은 코드이다
        // 향상된 for 문 사용하면 iterator 를 사용하여 순회한다.(알아서 최적화)


    }
}

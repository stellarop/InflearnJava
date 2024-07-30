package Intermediate2.collection.set.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        // 합집합 : 두 집합의 합 (중복 제거)
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);

        System.out.println("합집합 : " + set3);

        // 교집합 : 두 집합의 공통 값 (중복 제거)
        Set<Integer> set4 = new HashSet<>(set1);
        set4.retainAll(set2);
        System.out.println("교집합 : " + set4);

        // 차집합 : 집합1, 집합2와 같은 값을 뺀 나머지
        Set<Integer> set5 = new HashSet<>(set1);
        set5.removeAll(set2);
        System.out.println("차집합 : " + set5);
    }
}

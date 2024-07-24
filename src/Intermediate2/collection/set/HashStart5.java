package Intermediate2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // LinkedList 컬렉션을 생성한게 아닌 LinkedList 타입의 배열를 생성한 것
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("buckets : " + Arrays.toString(buckets));

        for (int i = 0; i < buckets.length; i++) {
            // 배열의 값을 노드로 구성한다
            // 최종적으로 하나의 배열 안에 10개의 노드로 구성된다
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets : " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        // 해시 충돌
        add(buckets, 9);

        System.out.println("buckets : " + Arrays.toString(buckets));

        // 조회
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket.contains(" + searchValue + ")" +  " : " + contains);
 
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        // 해시 인덱스 구하기
        int hashIndex = hashIndex(searchValue);
        // LinkedList 생성
        LinkedList<Integer> bucket = buckets[hashIndex];
        // 컬렉션에서 값 조회하는 기능을 제공
        return bucket.contains(hashIndex);

    }
    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        // set 은 유일성 보장 같은 값 추가 x
        if(!bucket.contains(value)){
            bucket.add(value);
        }


    }

    static int hashIndex(int value){
        // 해시 인덱스
        // 해시는 값을 인덱스로 넣는 방식을 취하는데 값이 늘어날수록 크기가 커지고 비효율적
        // 그래서 값 % 배열 길이(나머지를 구한 뒤) 해시 인덱스 방식으로 넣는다
        // ex) 99를 넣는다면 9 % 10 = 9 인덱스에 값을 삽입
        return value % CAPACITY;
    }
}

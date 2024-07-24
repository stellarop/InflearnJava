package Intermediate2.collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {

        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray : " + Arrays.toString(inputArray));

        // 조회
        int searchValue = 14;
        // 조회 하기 전 해당 값으로 해시 인덱스를 구하고 진행
        int searchIndex = hashIndex(searchValue);
        System.out.println("searchIndex : " + inputArray[searchIndex]);

    }

    static int hashIndex(int value){
        // 해시 인덱스
        // 해시는 값을 인덱스로 넣는 방식을 취하는데 값이 늘어날수록 크기가 커지고 비효율적
        // 그래서 값 % 배열 길이(나머지를 구한 뒤) 해시 인덱스 방식으로 넣는다
        // ex) 99를 넣는다면 9 % 10 = 9 인덱스에 값을 삽입
        return value % CAPACITY;
    }

    private static void add(Integer[] inputArray, int value){
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }
}

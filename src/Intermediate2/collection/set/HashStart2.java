package Intermediate2.collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] inputArr = new Integer[10];
        inputArr[1] = 1;
        inputArr[2] = 2;
        inputArr[5] = 5;
        inputArr[8] = 8;

        System.out.println("inputArr : " + Arrays.toString(inputArr));

        int searchValue = 8;
        // 접근 속도 0(1)
        // 배열의 인덱스를 값으로 삽입
        System.out.println("searchValue : " + inputArr[searchValue]);

    }
}

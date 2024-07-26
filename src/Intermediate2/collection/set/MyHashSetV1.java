package Intermediate2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    // 배열 길이 선언
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    // LinkedList 형식의 배열 선언
    LinkedList<Integer>[] buckets;
    private int size = 0;
    // 기본 길이는 16
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1(){
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets(){
        buckets = new LinkedList[capacity];

        // 배열의 값을 노드로 생성
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value){
        // 해시 인덱스 찾기
        int hashIndex = hashIndex(value);
        // 해시 인덱스로 해당 인덱스 값 찾기
        LinkedList<Integer> bucket = buckets[hashIndex];

        // 해시 인덱스로 해당 값이 존재하면 false
        if(bucket.contains(bucket)){
            return false;
        }else{
            // 없다면 add
            bucket.add(value);
            size++;
            return true;
        }
    }

    public boolean contains(int searchValue){
        // 해시 인덱스 찾기
        int hashIndex = hashIndex(searchValue);
        // 해시 인덱스로 값 조회
        LinkedList<Integer> bucket = buckets[hashIndex];
        // 값이 있으면 true 아니면 false
        return bucket.contains(searchValue);
    }

    public boolean remove(int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        // LinkedList 는 remove 메서드가 2개 존재
        // 실제 값을 삭제하는 메서드
        // 인덱스로 삭제하는 메서드
        // 숫자로 넘기면 인덱스 위치를 지우고 Object(래퍼 클래스)로 넘기면 실제 값을 지운다
        // 실제 값을 삭제할땐 정수 타입이라면 래퍼 형식으로 변환해서 사용한다
        boolean remove = bucket.remove(Integer.valueOf(value));

        if(remove){
            size--;
            return true;
        }else{
            return false;
        }
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    private int hashIndex(int value){
        // 해시 인덱스
        // 해시는 값을 인덱스로 넣는 방식을 취하는데 값이 늘어날수록 크기가 커지고 비효율적
        // 그래서 값 % 배열 길이(나머지를 구한 뒤) 해시 인덱스 방식으로 넣는다
        // ex) 99를 넣는다면 9 % 10 = 9 인덱스에 값을 삽입
        return value % capacity;
    }
}

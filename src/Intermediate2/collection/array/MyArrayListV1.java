package Intermediate2.collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    // 배열의 용량
    private static final int DEFAULT_CAPACITY = 5;

    // 모든 타입을 담을 수 있는 Object 배열
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1(){
        // 기본 배열 용량 = 5
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity){
        // 인스턴스 생성 시 넘긴 배열의 인자가 있으면 용량 직접 설정
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o){
        // 배열의 값 추가
        elementData[size] = o;
        size++;
    }

    public Object get(int index){
        // 파라메터로 받은 인덱스의 값 리턴
        return elementData[index];
    }

    public Object set(int index, Object element){
        // 변경 전 값 저장
        Object oldValue = get(index);
        // 입력한 인덱스 위치에 입력한 값으로 변경
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o){
        // 배열 size 만큼 for
        for (int i = 0; i < size; i++) {
            // 넘어온 Object 인자와 elementData 배열의 값이 같으면 해당 인덱스 리턴
            if (o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        // copyOf = 배열의 사이즈만큼 카피
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size : " + size +
                " capacity : "  + elementData.length;
    }

}

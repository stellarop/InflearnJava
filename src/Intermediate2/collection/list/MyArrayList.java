package Intermediate2.collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{
    // 배열의 용량
    private static final int DEFAULT_CAPACITY = 5;

    // 모든 타입을 담을 수 있는 Object 배열
    private Object[] elementData;
    private int size = 0;

    public MyArrayList(){
        // 기본 배열 용량 = 5
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity){
        // 인스턴스 생성 시 넘긴 배열의 인자가 있으면 용량 직접 설정
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(E e){
        // 배열 사이즈 같거나 넘을 시 후처리
        if (size == elementData.length){
            grow();
        }

        // 배열의 값 추가
        elementData[size] = e;
        size++;
    }

    @Override
    public void add(int index, E e){
        // 배열 사이즈 같거나 넘을 시 후처리
        if (size == elementData.length){
            grow();
        }

        // 데이터 이동
        shiftRightFrom(index);

        // 배열의 값 추가
        elementData[index] = e;
        size++;
    }

    // 요소의 마지막부터 index 까지 오른쪽으로 밀기
    private void shiftRightFrom(int index){
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    // 추가 요소의 index 부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index){
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    @Override
    // 값 지우기
    public E remove(int index){
        E oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void grow(){
        // 기존 배열 길이
        int oldCapacity = elementData.length;
        // 기존 배열 길이에 * 2
        int newCapacity = elementData.length * 2;

        // 새로운 배열 생성
        Object[] newArr = new Object[newCapacity];

//        // 기존 배열 값을 새로운 배열에 추가
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }

        // 기존 배열을 새로운 배열에 카피 위 코드랑 비슷한 코드인데 성능은 더 빠르다.
        elementData = Arrays.copyOf(elementData, newCapacity);;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index){
        // 파라메터로 받은 인덱스의 값 리턴
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E e){
        // 변경 전 값 저장
        E oldValue = get(index);
        // 입력한 인덱스 위치에 입력한 값으로 변경
        elementData[index] = e;
        return oldValue;
    }

    @Override
    public int indexOf(E e){
        // 배열 size 만큼 for
        for (int i = 0; i < size; i++) {
            // 넘어온 Object 인자와 elementData 배열의 값이 같으면 해당 인덱스 리턴
            if (e.equals(elementData[i])){
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

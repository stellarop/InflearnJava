package Intermediate2.collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value){
        // set 의 특징
        // 유일성을 보장한다.
        // 중복된 값 추가 불가능
        if(contains(value)){
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }

    public boolean contains(int value){
        for (int i = 0; i < elementData.length; i++) {
            if(value == elementData[i]){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void remove(int value){

    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}

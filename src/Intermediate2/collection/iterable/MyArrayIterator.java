package Intermediate2.collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        // 현재 index 가 targetArr 에 길이에 끝에 있다면
        return currentIndex < targetArr.length- 1;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}

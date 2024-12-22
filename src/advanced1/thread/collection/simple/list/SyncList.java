package advanced1.thread.collection.simple.list;

import java.util.Arrays;

import static advanced1.util.ThreadUtils.sleep;

public class SyncList implements SimpleList{

    private static final int DEFAULT_CAPATICY = 5;
    private Object[] elementData;
    int size = 0;

    public SyncList() {
        elementData = new Object[DEFAULT_CAPATICY];
    }

    @Override
    public synchronized int size() {
        return size;
    }

    @Override
    public synchronized void add(Object o) {
        if(size < DEFAULT_CAPATICY){
            elementData[size] = o;
            // 멀티 스레드 문제를 만드는 코드
            sleep(100);
            size++;
        }else{
            System.out.println("사이즈 초과");
        }

    }

    @Override
    public synchronized Object get(int index) {
        return elementData[index];
    }

    @Override
    public synchronized String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size : " + size + " capaity : " + elementData.length;
    }
}

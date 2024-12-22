package advanced1.thread.collection.simple.list;

import java.util.Arrays;

import static advanced1.util.ThreadUtils.sleep;

public class BasicList implements SimpleList{

    private static final int DEFAULT_CAPATICY = 5;
    private Object[] elementData;
    int size = 0;

    public BasicList() {
        elementData = new Object[DEFAULT_CAPATICY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object o) {
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
    public Object get(int index) {
        return elementData[index];
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size : " + size + " capaity : " + elementData.length;
    }
}

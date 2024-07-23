package Intermediate2.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("ArrayList addFirst");
        // ArrayList 컬렉션은 앞에서 값을 추가하는데 많은 시간이 걸린다.
        // 인덱스에 접근하는건 빠르나 값을 추가할수록 오른쪽으로 인덱스를 밀어야 하기 때문
        addFirst(new ArrayList<>(), size);
        System.out.println("ArrayList addMid");
        // 중간에 값을 추가하는건 ArrayList, linkedList 컬렉션 둘다 비슷하다
        // 컴퓨터 사양에 따른 변화가 있겠지만 로컬에서 테스트 시 ArrayList 성능이 조금 더 빠르다.
        // ArrayList 같은 경우는 값을 중간에 추가 하였기 때문에 오른쪽으로 배열을 미는 시간이
        // 조금 줄어들어서 값을 처음부터 추가하는 것보단 빨라진 반면에
        // linkedList 는 중간 값을 찾아가는데 오랜 시간이 걸리고 값을 추가하는덴 빠르다
        addMid(new ArrayList<>(), size);
        System.out.println("ArrayList addLast");

        // 조회 인스턴스 생성
        ArrayList<Integer> arrayList = new ArrayList<>();
        // ArrayList 는 뒤에서 값을 추가하는건 빠르다.
        // 값을 뒤로 미는 과정에서 많은 시간이 걸리지만 뒤에서 값을 추가할땐 그런 과정이 없기 때문이다.
        addLast(arrayList, size);

        System.out.println("LinkedList addFirst");
        // linkedList 컬렉션은 앞에서 값을 추가 하는데 오랜 시간이 걸리지 않는다.
        // 인덱스에 접근하는것(정확히는 인덱스가 아니라 노드의 개수)은 느리나 값을 추가하는데
        // 노드 객체의 참조만 변경하기 때문이다
        addFirst(new LinkedList<>(), size);
        System.out.println("LinkedList addMid");
        addMid(new LinkedList<>(), size);
        System.out.println("LinkedList addLast");

        LinkedList<Integer> linkedList = new LinkedList<>();
        // LinkedList 는 뒤에서 값을 추가하는건 굉장히 느리다.
        // 인덱스(노드의 개수)를 찾아가는데에 많은 시간이 걸린다.
        addLast(linkedList, size);

        int loop = 10000;
        System.out.println("조회 성능 비교");
        System.out.println("ArrayList 조회");
        // ArrayList 컬렉션은 인덱스의 대한 접근이 빠르다 앞, 뒤, 중간 차이가 없음
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size -2);

        System.out.println("LinkedList 조회");
        // LinkedList 컬렉션은 인덱스가 늘어날수록 접근이 느리다.
        // 생성된 노드를 읽어야 하기 때문
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size -2);



        // 결론

        // 데이터 추가
        // 앞에서 값을 추가할땐 LinkedList 를 쓰고
        // 뒤에서 값을 추가할땐 ArrayList 를 쓰자
        // 중간에 값을 추가할땐 그때 생각하자

        // 인덱스 접근
        // 무조건 ArrayList 를 쓰자
    }

    private static void addFirst(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("중간에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("index : " + index + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }
}

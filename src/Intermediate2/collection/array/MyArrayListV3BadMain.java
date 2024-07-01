package Intermediate2.collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        // 숫자만 입력하길 기대
        list.add(1);
        list.add(1);
        list.add("3");
        System.out.println(list);

        // 값을 꺼낼때 Object 를 반환하므로 다운 캐스팅 필요하다
        Object num1 = (Integer) list.get(0);
    }
}

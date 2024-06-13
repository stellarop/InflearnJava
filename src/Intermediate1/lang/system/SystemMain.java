package Intermediate1.lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis : " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다
        long currentNanoTimeMillis = System.nanoTime();
        System.out.println("currentNanoTimeMillis : " + currentNanoTimeMillis);

        // 환경 변수를 읽는다
        System.out.println("getenv : " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties : " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] orinArr = {'h','e','l','l','o'};
        char[] copyArr = new char[5];
        System.arraycopy(orinArr, 0, copyArr, 0, orinArr.length);

        System.out.println("copyArr : " + copyArr);
        System.out.println("Arrays.toString : " + Arrays.toString(copyArr));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}

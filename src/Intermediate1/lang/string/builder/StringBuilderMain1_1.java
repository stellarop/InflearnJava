package Intermediate1.lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        // String 객체의 단점은 불변 객체라 문자를 더하거나 변경할 때 계속해서 새로운 객체를 생성해야 되는 점이다
        // 이 문제를 해결하려면 불변이 아닌 가변 String 을 이용하면 된다
        // 객체를 생성할 필요도 없고 성능, 메모리 사용면에서 효과적
        StringBuilder sb = new StringBuilder();
        // 가변 스트링에 값 더하기
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println("sb : " + sb);

        // 가변 스트링 변수에 자리수 지정 후 insert
        // 불변이 아니라 리턴값 안받고 사용 가능
        sb.insert(4, "Java");
        System.out.println("insert : " + sb);
        // 가변 스트링 변수에 자리수 지정 후 delete
        sb.delete(4, 8);
        System.out.println("delete : " + sb);
        // 가변 스트링 변수 뒤집기
        sb.reverse();
        System.out.println("reverse : " + sb);

        // StringBuilder -> String 스트링 빌더는 다시 스트링으로 변환 가능
        String str = sb.toString();
        System.out.println("str : " + str);
    }
}

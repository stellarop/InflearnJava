package Intermediate1.lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        // String 객체의 단점은 불변 객체라 문자를 더하거나 변경할 때 계속해서 새로운 객체를 생성해야 되는 점이다
        // 이 문제를 해결하려면 불변이 아닌 가변 String 을 이용하면 된다
        // 객체를 생성할 필요도 없고 성능, 메모리 사용면에서 효과적
        StringBuilder sb = new StringBuilder();
        // 가변 스트링에 값 더하기
        // 메서드 체이닝으로 변경
        sb.append("a").append("b").append("c").append("b")
                        .insert(4,"Java")
                            .delete(4,8)
                                .reverse()
                                        .toString();
        System.out.println("sb : " + sb);

    }
}

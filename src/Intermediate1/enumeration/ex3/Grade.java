package Intermediate1.enumeration.ex3;

public enum Grade {
    // 열거형의 장점
    // 타입 안전성 향상 : 사전의 정의된 상수들로만 구성되므로 유효하지 않는 값이 입력되지 않음
    // 간결성 및 일관성 : 열거형을 사용하면 코드가 간결해지고 명확해지고 데이터 일관성 보장
    // 확장성 : 새로운 회원 등급의 타입을 추가하고 싶을때 ENUM 에 새로운 상수를 추가해주기만 하면 된다
    BASIC, GOLD, DIAMOND;
}

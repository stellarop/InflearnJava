package basic.construct;

public class MemberThis {
    String nameField;

    // this는 생략 가능
    // 변수를 찾을때 가까운 지역변수를 찾고 없으면 그 다음 멤버 변수를 찾는다 둘 다 없으면 오류가 발생한다.
    void initMember(String nameParam){
        // nameField는 앞에 this가 없어도 멤버 변수에 접근한다.
        // 파라메터와 멤버 변수의 변수가 같으면 받은 파라미터 값에 파라미터 변수에 값을 대입한다고 인식하기 때문에 오류가 발생한다
        nameField = nameParam;
    }
}

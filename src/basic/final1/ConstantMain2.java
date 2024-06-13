package basic.final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("최대 참여자 수 : " + FieldInit.MAX_USERS);
        int totalCount = 999;

        process(totalCount++);
        process(totalCount++);
        process(totalCount++);

    }

    private static void process(int totalCount){
        System.out.println("참여자 수 : " + totalCount);
        if(totalCount >  FieldInit.MAX_USERS){
            System.out.println("대기자로 등록");
        }else{
            System.out.println("참여합니다.");
        }
    }

}

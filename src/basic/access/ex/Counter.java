package basic.access.ex;

public class Counter {

    // 초깃값
    private int count = 0;
    // 최대값 생성자 통해 입력
    private int max;

    Counter(int max){
        this.max = max;
    }

    // 숫자 1 증가
    public void increment(){
        if(count >= max){
            System.out.println("최댓값을 초과할 수 없습니다.");
        }else{
            count += 1;
        }

    }

    public int getCount(){
        return count;
    }
}

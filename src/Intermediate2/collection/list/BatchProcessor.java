package Intermediate2.collection.list;

public class BatchProcessor {

    // 같은 기능일지라도 각 컬렉션에 따라 성능 차이가 날 수 밖에 없다.
    // 어떤 컬렉션을 쓸지 코드로 정의하는게 아닌 추상적인것에 의존하고 의존관계 주입을 하여야 한다
    private final MyList<Integer> list;

    // BatchProcessor 가 실행되는 시점에 어떤 컬렉션을 쓸지 의존관계 주입
    // 생성자를 통해 의존관계를 주입했기 때문에 생성자 의존관계 주입
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size){
        
        Long startTime = System.currentTimeMillis();
        
        for(int i = 0; i < size; i++){
            list.add(0,i);
        }
        
        Long endTime = System.currentTimeMillis();
        System.out.println("크기 = " +  size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }
}

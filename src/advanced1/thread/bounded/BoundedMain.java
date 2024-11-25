package advanced1.thread.bounded;

import java.util.ArrayList;
import java.util.List;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class BoundedMain {
    public static void main(String[] args) {
        // BoundedQueue 선택
        BoundedQueue queue = new BoundedQueueV3(2);

        // 생산자 소비자 실행 순서 선택

        // 생산자 먼저 실행
        producerFirst(queue);
        // consumerFirst(queue);

    }

    private static void producerFirst(BoundedQueue queue){
        log("== [생산자 먼저 실행] 시작, " + queue.getClass().getSimpleName()
                + " ==");
        // 스레드를 담을 리스트 생성
        List<Thread> threads = new ArrayList<>();
        // 생산자 스레드 생성 메서드 실행
        startProducer(queue, threads);
        // 생성한 스레드 출력
        printAllState(queue, threads);
        // 생산자 스레드 생성 메서드 실행
        startConsumer(queue, threads);
        // 생성한 스레드 출력
        printAllState(queue, threads);

        log("== [생산자 먼저 실행] 종료, " + queue.getClass().getSimpleName()
                + " ==");
    }

    private static void consumerFirst(BoundedQueue queue){
        log("== [소비자 먼저 실행] 시작, " + queue.getClass().getSimpleName()
                + " ==");
        // 스레드를 담을 리스트 생성
        List<Thread> threads = new ArrayList<>();

        // 소비자 스레드 생성 메서드 실행
        startConsumer(queue, threads);
        printAllState(queue, threads);

        // 생산자 스레드 생성 메서드 실행
        startProducer(queue, threads);
        // 생성한 스레드 출력
        printAllState(queue, threads);


        log("== [소비자 먼저 실행] 종료, " + queue.getClass().getSimpleName()
                + " ==");
    }

    private static void startProducer(BoundedQueue queue, List<Thread> threads){
        System.out.println();
        log("생산자 시작");

        for (int i = 1; i <= 3; i++) {
            // 생산자 스레드 3개 생성
            Thread producer = new Thread(new ProducerTask(queue, "data" + i), "producer" + i);
            // 생성한 스레드 리스트에 추가
            threads.add(producer);
            // 스레드 시작
            producer.start();
            sleep(100);
        }

    }

    private static void startConsumer(BoundedQueue queue, List<Thread> threads){
        System.out.println();
        log("소비자 시작");

        for (int i = 1; i <= 3; i++) {
            // 소비자 스레드 3개 생성
            Thread consumer = new Thread(new ConsumerTask(queue), "consumer" + i);
            // 생성한 스레드 리스트에 추가
            threads.add(consumer);
            // 스레드 시작
            consumer.start();
            sleep(100);
        }
    }

    private static void printAllState(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("현재 상태 출력");
        log("큐 데이터 : " + queue);

        for (Thread thread : threads) {
            log(thread.getName() + " : " + thread.getState());
        }
    }
}

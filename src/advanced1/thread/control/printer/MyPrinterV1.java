package advanced1.thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class MyPrinterV1 {
    public static void main(String[] args) {
        // main 스레드가 입력을 받으면
        // printerThread 스레드가 입력을 받은 순서(FIFO) 구조

        // 프린터 인스턴스 생성
        Printer printer = new Printer();
        // 프린터 인스턴스, 스레드 이름 지정 후 main 스레드가 printerThread 스레드 생성
        Thread printerThread = new Thread(printer, "printer");
        // 스레드 시작
        printerThread.start();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("프린트할 문서를 입력하세요 종료(x)");
            String input = scanner.nextLine();

            if("x".equals(input) || "X".equals(input)){
                // 프린터 작동 중단
                // 종료를 눌렀을때 바로 종료되지 않는다.
                // 이 부분은 인터럽트로 printerThread 스레드를 종료해야 한다
                printer.work = false;
                break;
            }

            printer.add(input);

        }


    }

    static class Printer implements Runnable {
        // 여러 스레드가 동시에 접근하는 변수에는 volatile 키워드를 붙혀줘야 안전하다
        volatile boolean work = true;
        // 프린트를 순차적으로 처리 할 수 있는 컬렉션 구현(FIFO)
        Queue<String> jobQueue = new ConcurrentLinkedQueue();

        public void add(String input){
            jobQueue.offer(input);
        }

        @Override
        public void run(){
            while (work){
                // jobQueue 가 빈 값이면 빠져나온다
                if(jobQueue.isEmpty()){
                    continue;
                }

                // 값을 하나 꺼낸다
                String job = jobQueue.poll();
                log("출력 시작 : " + job + ", 대기 문서 : " + jobQueue);
                sleep(3000);
                log("출력 완료");
            }

            log("프린터 종료");

        }
    }
}

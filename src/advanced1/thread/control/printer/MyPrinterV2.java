package advanced1.thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class MyPrinterV2 {
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
                printerThread.interrupt();
                break;
            }

            printer.add(input);

        }


    }

    static class Printer implements Runnable {

        // 프린트를 순차적으로 처리 할 수 있는 컬렉션 구현(FIFO)
        Queue<String> jobQueue = new ConcurrentLinkedQueue();

        public void add(String input){
            jobQueue.offer(input);
        }

        @Override
        public void run(){

            // 인터럽트가 발생하면 상태가 true 로 변한 뒤 캐치로 잡아낸다 그 후 false 로 변환
            while (!Thread.interrupted()){
                // jobQueue 가 빈 값이면 빠져나온다
                if(jobQueue.isEmpty()){
                    continue;
                }

                try {
                    // 값을 하나 꺼낸다
                    String job = jobQueue.poll();
                    log("출력 시작 : " + job + ", 대기 문서 : " + jobQueue);
                    log("출력 완료");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    log("인터럽트 발생");
                    break;
                }

            }

            log("프린터 종료");

        }
    }
}

package advanced1.thread.bounded;

import java.util.concurrent.BlockingQueue;

import static advanced1.util.MyLogger.log;

public class ProducerTask implements Runnable{
    private BlockingQueue<String> queue;
    private String request;

    public ProducerTask(BlockingQueue<String> queue, String request) {
        this.queue = queue;
        this.request = request;
    }

    @Override
    public void run() {
        log("[생산 시도] : " + request + " -> " + queue);
        try {
            queue.put(request);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log("[생산 완료] : " + request + " -> " + queue);
    }
}

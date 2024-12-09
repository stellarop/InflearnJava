package advanced1.thread.bounded;

import java.util.concurrent.BlockingQueue;

import static advanced1.util.MyLogger.log;

public class ConsumerTask implements Runnable{
    private BlockingQueue<String> queue;

    public ConsumerTask(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        log("[소비 시도] : " + queue);
        String data = null;
        try {
            data = queue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log("[소비 완료] : " + data);
    }
}

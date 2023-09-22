import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer_046 implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Producer_046(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Producer_046 produced: " + i);
                queue.put(i);
                Thread.sleep(1000); // Simulate some work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer_046 implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer_046(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                int value = queue.take();
                System.out.println("Consumer_046 consumed: " + value);
                Thread.sleep(1500); // Simulate some work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerExample_046 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // Create a blocking queue with a size of 5

        Thread producerThread = new Thread(new Producer_046(queue));
        Thread consumerThread = new Thread(new Consumer_046(queue));

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


package MultiThreading.producerAndConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumer {

    private final Queue<Integer> queue;
    private int capacity;
    private int count;

    // 🔥 NEW: turn control
    private boolean isProduced;

    public ProducerAndConsumer(int size){
        queue = new LinkedList<>();
        this.capacity = size;
        this.count = 1;
        this.isProduced = false; // producer starts first
    }

    public synchronized void producer() {
        while (count <= capacity) {

            // wait if previous item not yet consumed
            while (isProduced) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println("Error in Producer");
                }
            }

            queue.add(count);
            System.out.println("Produced: " + count);

            count++;
            isProduced = true;

            notifyAll();
        }
    }

    public synchronized void consumer() {

        while (true) {

            // wait until something is produced
            while (!isProduced) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println("Error in Consumer");
                }
            }

            int val = queue.poll();
            System.out.println("Consumed: " + val);

            isProduced = false;

            notifyAll();

            // 🔥 Optional graceful exit
            if (val == capacity) break;
        }
    }
}
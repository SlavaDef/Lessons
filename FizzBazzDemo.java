package HomeWork12;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import static java.lang.Thread.sleep;

public class FizzBazzDemo {
    private static final int n = 21;
    public static volatile AtomicInteger number = new AtomicInteger(1);
    public static BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {

        new FizzBazzDemo().threads();
    }
    public synchronized void threads() {
        ExecutorService exService = Executors.newFixedThreadPool(5);

        exService.submit(() -> {

            while (number.get() < n) {
                if (number.get() % 3 == 0 && number.get() % 5 != 0) {
                    queue.add("fizz");
                    number.incrementAndGet();
                    Thread.currentThread().notifyAll();
                } else {
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        exService.submit(() -> {

            while (number.get() < n) {
                if (number.get() % 3 != 0 && number.get() % 5 == 0) {
                    queue.add("buzz");
                    number.incrementAndGet();
                    Thread.currentThread().notifyAll();
                } else {
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        exService.submit(() -> {

            while (number.get() < n) {
                if (number.get() % 3 == 0 && number.get() % 5 == 0) {
                    queue.add("fizzbuzz");
                    number.incrementAndGet();
                    Thread.currentThread().notifyAll();
                } else {
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        exService.submit(() -> {

            while (number.get() < n) {
                if (number.get() % 3 != 0 && number.get() % 5 != 0) {
                    queue.add(String.valueOf(number));
                    number.incrementAndGet();
                    Thread.currentThread().notifyAll();
                } else {
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        exService.submit(() -> {

            while (true) {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                while (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
            }
        });
    }
}

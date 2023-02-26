package HomeWork12;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskThreadOne {
    private static volatile boolean running = true;
    private static long before = System.currentTimeMillis();

    public static  void main(String[] args) {
        new Thread(() -> {

            while (running) {
                try {

                    Thread.sleep(1000);

            long after = System.currentTimeMillis();
                    System.out.println((after-before)/1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();

    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
     scheduledExecutorService.scheduleAtFixedRate(
             () -> System.out.println("5 seconds have passed!"),
             5,
             5,
    TimeUnit.SECONDS
           );
    }
}
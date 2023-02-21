package HomeWork12;

// Напишіть програму, яка кожну секунду відображає на екрані дані про час, що минув від моменту запуску програми.
//
//Другий потік цієї ж програми кожні 5 секунд виводить повідомлення Минуло 5 секунд.

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

        new Thread(() -> {

            while (running) {

                try {
                    Thread.sleep(5000);
                    System.out.println("5 seconds have passed! ");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();
    }
}

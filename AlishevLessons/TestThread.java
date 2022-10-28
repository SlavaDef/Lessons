package AlishevLessons;


import java.util.Scanner;

public class TestThread {

    public static void main(String[] args) {
        MyThread  myThread = new  MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in); // принимаем сообщение из консоли
        scanner.nextLine(); // сканер ожидает ввода(ентер или любая строка + ентер) после запуститься метод shutDown();
        myThread.shutDown(); // после сканера програма дойдет до выполнения этой задачи

        // задача иметь возможность останавливать поток через меин



    }

}


class MyThread extends Thread {

    private boolean running = true;// создали приватную переменную и поместили ее в цикл

    public void run() {
        while(running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    public void shutDown() { // метод назначающий приватной переменной фалс - цикл все
        this.running = false;
    }
}  // все работает но такой подход может работать не везде




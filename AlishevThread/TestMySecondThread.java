package AlishevThread;

public class TestMySecondThread {

    public static void main(String[] args) {

// в качестве аргумента, потоку передаем обьект нашего класса в котором реализуем интерфейс Runnable
        //  при создании обьекта передаем логтку которую реализовали в run()
         Thread thread = new Thread(new Runner());
         thread.start();

        // the same case
        new Thread(new Runner()).start();

        // тут поток main() завершил свои инструкции (исполнения) но поскольку мы создали два потока то
        // программа не завершиться пока они(потоки) не завершат свое исполнение
        // Java программа закончиться тогда когда все потоки закончат свое исполнение не смотря даже на то что в
        // main не осталось кода

        System.out.println("Hello from main");


}
    }

class  Runner implements Runnable{ // имплементим интерфейс Runnable и реализуем его метод run()
    @Override
    public void run() {
        for(int i = 0; i<25; i++){
            try {
                Thread.sleep(2000); // задержка вывода на 1000милисек
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            System.out.println("Hei, Hai, lalalai " + i);
        }

    }

}
package AlishevThread;

import java.util.Scanner;

public class TestThreadWithVolatile {

    public static void main(String[] args) {

        MySecondThread mySecondThreadnew  = new MySecondThread();
        mySecondThreadnew.start(); // стартуем поток

        new Scanner(System.in).nextLine(); // поток идет до ентер
        mySecondThreadnew.shutDown(); // после вызов метода останавливающий цикл путем изменения значения перемен
    }
}

class MySecondThread extends Thread{ // теперь этот клас поток, унаследовались от потока
    //volatile гарантирует когерентность кешей ядер, нужно использовать обязательно если один поток читает другой выводит
    // и чтобы у всех потоков была одна и та же версия переменной (в нашем случае boolean running)
    private volatile boolean running = true; //volatile  говорит джаве что переменную не нужно кешировать

public  void run(){

    while(running){
        System.out.println("Hello Diadia!");
        try {
            Thread.sleep(2000); // после каждой операции засыпаем на 2000мили сек
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

public  void shutDown(){
    this.running = false;
}

}

package AlishevLessons;



// Queue - очередь, интерфейс, сможем помещать элементы в очередь и вытаскивать их в том порядке в котором их поместили

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

    public static void main(String[] args) {

        Robot robot1 = new Robot(36);
        Robot robot2 = new Robot(888);
        Robot robot3 = new Robot(12);
        Robot robot4 = new Robot(5);
        // создаем очередь, она параметизированная - сразу указываеться тип

        // Queue<Robot> robots = new LinkedList<>(); // LinkedList реализует интерфейс Queue
        // в ArrayBlockingQueue нужно обазательно в параметрах указывать размер очереди
        Queue<Robot> robots = new ArrayBlockingQueue<>(6);
        robots.add(robot3);
        robots.add(robot1); // метод add() выбросит исключение если добавим больше чем 6 в нашем случае
        robots.add(robot4);
        robots.add(robot2);
        // robots.offer(robot4);  // the metod offer() return false if we add > 6 in our case
        // and the metod poll() return false if there is no such element

        // robot3 <- robot1 <- robot4 <- robot2 порядок нашей очереди

        System.out.println(robots.remove()); // удалиться первый добавленный // robot3 или выбросит исключение если элементов нет
        System.out.println(robots.peek()); // проверка первого элемента в очереди, без удаления // robot1
        System.out.println(robots);

/*for(Robot robot: robots)      // если в цикле одна строчка кода то можно без {....} скобок
System.out.println(robot);*/    // вывод всех роботов на экран
    }
}

class Robot{

private int number;

Robot(int number){
    this.number = number;

}

public String toString(){
    return "The robot with number " + number + " is created.";
}

}

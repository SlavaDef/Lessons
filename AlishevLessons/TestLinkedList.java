package AlishevLessons;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));
       // System.out.println(myLinkedList.get(5)); // выбросит исключение такого индекса нет
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);

    }
}

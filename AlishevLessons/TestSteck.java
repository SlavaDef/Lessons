package AlishevLessons;

import java.util.Stack;

public class TestSteck {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();// клас параматизованный

        // добавили 5 -> 3 -> 1 используя очеред мы бы получили 5(первый зашел первый вышел) тут наоборот последний зашел первый вышел

           stack.push(5); // metod push() add element in Stack
           stack.push(3);
           stack.push(1);

           while (!stack.empty()){ // пока список не пустой достаем и удаляем элементы - 1 - 3 - 5
               System.out.println(stack.pop());
           }

          stack.empty();           // вернет true если стек пустой и false если нет
        System.out.println(stack.peek()); // показывает последний элемент в списке без удаления // 1
           System.out.println(stack.pop()); // достает последний добавленный элемент из Stack и удаляет// 1
           System.out.println(stack); // [5,3]
           System.out.println(stack.pop()); // 3
           System.out.println(stack); // [5]
        System.out.println(stack.pop()); // 5
        System.out.println(stack); // []
        System.out.println(stack.pop()); // Exception in thread нет элементов

    }
}

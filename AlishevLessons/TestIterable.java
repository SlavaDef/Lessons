package AlishevLessons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterable { // Iterable -  то по чему можно проходиться(циклы)

    public static void main(String[] args) {

// ArrayList не подходит для этого примера поскольку если нам нужно что то удалять, заменять нужно использовать LinkedList
        List<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(88);
        list.add(33);

        // iterator() - в нем прописывалась логика прохождения по колекциям
         Iterator<Integer> iterator =  list.iterator(); // до java 5 так приходилось проходить по колекциям

           // before java 5,  задача удалить второй элемент
        int a = 0; // переменная счетчик
        while (iterator.hasNext()) { // пока в колекции есть след элементы
            System.out.println(iterator.next()); // печатаем их
            if(a==1){
            iterator.remove(); // здесь мы можем удалить текущий элемент, поскольку мы уже прошли по нему и как то обработали его
           }

            a++;
        }
        System.out.println(list);
        for(int x : list){
            // list.remove(1); - в цикле for each будет ошибка так нельзя в итераторе можно
            System.out.println(x);
        }

    }
}

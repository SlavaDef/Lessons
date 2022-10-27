package AlishevLessons;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson1 {

    public static void main(String[] args) {


        List<Integer> linkedList = new LinkedList<>();

        // LinkedList цепочка узлов(цепочка обьектов) у каждого обьекта есть значение и сслыка на след обьект[1]->[2]->[3]->[4]

        List<Integer> arrayList = new ArrayList<>(); // хранит инфу в расширяемом массиве

        // как работает ArrayList -> есть список[1][2][3][4][5] -> нужно что то добавить, добавляяем элемент в конец
        // списка -> [6] + увеличиваем на 1 внутреннее поле size
        // если нужно поместить что то в начало ArrayList  то перед єтим все єлементы сдвигаються вправо

        metherTimer(linkedList); // заняло 18 мили сек для заполнения не с конца а с начала LinkedList гараздо быстрее
        metherTimer(arrayList);  // заняло 1678 мили сек,

    }

    private static void metherTimer(List<Integer> list) { // в качестве параметров передаем лист интегеров



        long start = System.currentTimeMillis();

        for(int i=0; i<100000;i++) {
            list.add(0,i); //  теперь добавляем в начало списка
        }


        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}


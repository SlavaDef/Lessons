package AlishevLessons;

import java.util.HashSet;
import java.util.Set;

public class TestSet2 {


    public static void main(String[] args) {


        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        // union - обьединение множеств


        for(int i=0;i<6;i++){ // c помощью цикла заполнил множество hashSet1 числами от 0 до 5
            hashSet1.add(i);
        }

        for(int i=2;i<9;i++){ //  c помощью цикла заполнил множество hashSet2 числами от 2 до 8
            hashSet2.add(i);
        }

        Set<Integer> unionSet = new HashSet<>(hashSet1); // конструктор перегружен передаем первое множество в конст

        System.out.println(unionSet); // [0, 1, 2, 3, 4, 5]

        unionSet .addAll(hashSet2); // addAll метод принимающий значение другого Сета для обьединения

        System.out.println(unionSet); // [0, 1, 2, 3, 4, 5, 6, 7, 8]

        // intersextions - пересечение множеств

        Set<Integer> intersextions = new HashSet<>(hashSet1);

        System.out.println(intersextions);// [0, 1, 2, 3, 4, 5]
        intersextions.retainAll(hashSet2); // сохранит все одинаковые множества
        System.out.println(intersextions); // [2, 3, 4, 5]

        //  diferenses разность множеств

        Set<Integer> diferenses = new HashSet<>(hashSet1);
        diferenses.removeAll(hashSet2); // removeAll() удалит все одинаковые элементы с сетов

        System.out.println(diferenses); // [0, 1]
    }
}

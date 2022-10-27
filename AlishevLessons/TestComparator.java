package AlishevLessons;

import java.util.*;

public class TestComparator {

    public static void main(String[] args) {



        List<String> animals = new ArrayList<String>();
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(34);
        numbers.add(66);
        numbers.add(12);
        numbers.add(88);
        numbers.add(2);
        numbers.add(100);
        numbers.add(55);

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");
        animals.add("Bird");


        // Collections.sort(animals);// статический метод из колекций сортирующий листы, списки

         // теперь в параметры передаем обьект класса StringLengthComparator, метод может принимать два параметра
        Collections.sort(animals, new StringLengthComparator());// [Cat, Dog, Frog, Bird]
        //Collections.sort(numbers, new IntegerNumberComparator());


       // ещо способ с анонимным класом, не всегда удобно создавать отдельный класс

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2){
                    return 1;
                }
                else if(o1 > o2){
                    return -1;
                }
                else{
                    return 0;
                }
            }

        });

        // Collections.sort(numbers);

        System.out.println(animals); // отсортирует по алфавиту [Bird, Cat, Dog, Frog]
        System.out.println(numbers); // [12, 34, 66]


        /* когда нас не устраивает естественный порядок сортировки, скажем мы хотим отсортировать не по заглав
         буквам а по кол-ву символов или по длинне... Для таких случаев используеться интерфейс Comparator
         нам останеться  его реализовать и указать ту логику, которая нам необходима для сортировки обьектов...*/


    }

}

class StringLengthComparator implements Comparator<String>{// <String> интерфейс будет сравнивать строки
    @Override
    public int compare(String o1, String o2) {  // метод интерфейса который мы обязаны реализовать

       /*
       Java конвенция реализации метода compare():
       if o1 > o2 -> return 1;
       if o1 < o2 -> return -1;
       if o1 == o2 -> return 0;
        */

        // логика для сортировки Integerov от большего к меньшему

         if(o1.length() > o2.length()){
          return 1;
}
        else if(o1.length() < o2.length()){
            return -1;
        }
        else{
            return 0;
         }


    }


}

class IntegerNumberComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            return 1;
        }
        else if(o1 > o2){
            return -1;
        }
        else{
            return 0;
        }
    }
}


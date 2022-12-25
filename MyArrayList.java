package Task09;

import Task9.MyArray;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> implements MyList{

    private int COPASITY = 2;

    Object [] objects = new Object[COPASITY];

    private int currentLight = 0;

    public void add(Object  element){

        if(objects.length >= COPASITY){
            COPASITY*=2;
        }

        objects[currentLight] = element;
        objects = Arrays.copyOf(objects,currentLight+2);
        currentLight++;

    }

    // 1 - что копируем, 2 - с какой позиции, 3 - куда копируем, 4 - с какого индекса записывать,
    // 5 кол во элементов которые копируем

    @Override
    public String toString() {

        return
                "Array = " + Arrays.toString(objects);

    }


    @Override
    public void size() {

    }

    @Override
    public void isEmty() {

    }

   /* @Override
    public void add(Object e) {

    } */
   public static void main(String[] args) {

       MyArrayList <Integer> myArray =  new MyArrayList();
       myArray.add(7);
       myArray.add(8);
       myArray.add(9);
       myArray.add("Hello");
       myArray.add("Word");
       myArray.add('r');
       myArray.add(0.22f);
       myArray.add(5555888l);
       myArray.add(345.44);
       myArray.add(45);


       System.out.println(myArray.toString());

       // вивід, тут буду думати що робити з нулем в кінці...
// Array = [7, 8, 9, Hello, Word, r, 0.22, 5555888, 345.44, 45, null]

      MyArrayList<Integer> list = new MyArrayList<>();
      list.add("D");

      ArrayList<String> arrayList = new ArrayList<>();

       arrayList.add("8");


   }

}

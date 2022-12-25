package Task9;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class MyArray  {


    private int COPASITY = 2; // тут я збільшу до 16

    //  в масив будуть добавляться любі обьекти чи потрібна реализація метода add для кожного типу данних?

    Object [] objects = new Object[COPASITY];

    private int currentLight = 0;

    public <E> void add(E  element){

if(objects.length >= COPASITY){
    COPASITY*=2;
    objects = Arrays.copyOf(objects,COPASITY);// можу чи я користуватися методом  Arrays.copyOf чи треба придумувать альтернативу?
}

    objects[currentLight] = element;
    objects = Arrays.copyOf(objects,currentLight+2);
    currentLight++;

    }

    @Override
    public String toString() {
        return
                "Array = " + Arrays.toString(objects);

    }

    public static void main(String[] args) {
       MyArray myArray =  new MyArray();
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

      // System.out.println(Arrays.toString(myArray));
        System.out.println(myArray.toString());

        // вивід, тут буду думати що робити з нулем в кінці...
// Array = [7, 8, 9, Hello, Word, r, 0.22, 5555888, 345.44, 45, null]


    }
}

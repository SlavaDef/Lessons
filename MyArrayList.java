package Task09;

import Task9.MyArray;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{

    private int COPASITY = 2;


    Object [] objects = new Object[COPASITY];


    private int currentSize = 0;

    MyArrayList(int COPASITY){
        this.COPASITY = COPASITY;
    }

    MyArrayList(){

    }

    public void add(E element){


        if(objects.length >= COPASITY){
            COPASITY*=2;
            //  System.arraycopy(objects,currentSize,objects,currentSize,1);
        }

        objects[currentSize] = element;
        objects = Arrays.copyOf(objects,currentSize+2);

        currentSize++;

    }

    @Override
    public int get(int index) {

        if(index<0| index>=objects.length){
           throw new IndexOutOfBoundsException();
        }

        return (int) objects[index];
    }

      @Override
    public String toString() {

        return
                "Array = " + Arrays.toString(objects);

    }

    @Override
  public int size() {
return objects.length-1;

    }

    @Override
    public void clear() {
        for(int i = 0; i<objects.length;i++){
            objects[i] = null;
        }
        COPASITY = 0;
    }

   /* @Override
    public E remove(int index) {

       return objects[index] = null;

       // for(int i =0; i<objects.length; i++){

       // }

    } */


    public static void main(String[] args) {

       MyList <Integer> myArray =  new MyArrayList();
       myArray.add(7);
       myArray.add(8);
       myArray.add(9);
       // myArray.add("Hello");
      // myArray.add("Word");
      // myArray.add('r');
      // myArray.add(0.22f);
      // myArray.add(5555888l);
      // myArray.add(345.44);
      // myArray.add(45);




       System.out.println(myArray.toString());

       System.out.println(myArray.get(2));
       System.out.println(myArray.get(0));
      // System.out.println(myArray.get(3));
       System.out.println(myArray.size());
       myArray.clear();
        System.out.println(myArray.size());
        System.out.println(myArray.toString());





   }

}

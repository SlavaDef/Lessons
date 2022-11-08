package Mod4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortPyzurlom {

    public static void main(String[] args) {
        int[] array = {-2, -7, 33, -33, 9, 12, 99, -5, 6, 13, 44};
        sortPyzur(array);
        System.out.println(Arrays.toString(array)); // [-33, -7, -5, -2, 6, 9, 12, 13, 33, 44, 99]
    }

    private static void sortPyzur(int[] array) {

         for(int i = 0; i < array.length-1; i++){ // берем первый элемент
             for(int j = 0; j < array.length-i-1; j++){ // след элемент
           if(array[j] > array[j+1]){ // сравнения первого с последующим
              int temp = array[j];
            array[j] = array[j+1];
               array[j+1] = temp;
           }


             }


}

    }

}
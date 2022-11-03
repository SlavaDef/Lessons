package TestLessons;

import java.util.Arrays;

public class Massivs {

    public static void main(String[] args) {

        /* int [] arr = new int[4];
        int [] arri = {7,8,9,10};  // разные способы создания массивов

        // System.out.println(arr);
        //System.out.println(arr.toString());


        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        System.out.println("Before");

        System.out.println(Arrays.toString(arr)); // вывод массива на экран
        System.out.println(Arrays.toString(arri));

        System.out.println("After");

        int[] newArray = Arrays.copyOf(arr,8); // создали новый массив и скопировали в него предыдущий массив и установили новую длинну в 8 элементов
        newArray[4] = 88;
        System.out.println(Arrays.toString(newArray));

        newArray[5] = 88;
        newArray[6] = 88;
        newArray[7] = 88;
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.compare(arri, newArray )); // сравнение массивов - равен, больше  или меньше */


        int[][] arr = new int[4][2];// длинна 4 глубина 2 4 масива по 2 цифры

        arr[0][0] = 0; // масив 1 элемент 1
        arr[0][1] = 1; // масив 1 элемент 2

        arr[1][0] = 2;
        arr[1][1] = 3;

        arr[2][0] = 4; // масив 3 элемент 1
        arr[2][1] = 5; // масив 3 элемент 2

        arr[3][0] = 6;
        arr[3][1] = 7;
        System.out.print(Arrays.deepToString(arr)+"\n");// быстрый способ вывода двухмерного массиыва
    }
}

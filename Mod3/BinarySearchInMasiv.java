package Mod3;

import java.util.Arrays;

public class BinarySearchInMasiv {

    static int counter = 0;

    public static void main(String[] args) {
        int [] arr = new int[] {34,-2,8,12,-12,-56,99,54,33,77,-9,8,8,69};

        int res = new  BinarySearchInMasiv().searchBinarry(arr,34);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
        System.out.println(counter);

    }

    // Бинарный поиск только для отсортированных массивовю Берем средний элемент и сравниваем с тем который ищем
//  если средний меньше тогда ищем в правой части, если больше в левой...

    private static int searchBinarry(int[] arr, int searsh) {

        Arrays.sort(arr);
        int lowInd = 0; // первый элем в массиве
        int hightInd = arr.length - 1; // последний элем в массиве

        while (lowInd <= hightInd) {
            counter++;
            int midlInd = (lowInd + hightInd) / 2; // поиск среднего индекса
            int midlElement = arr[midlInd]; // новая переменная равна  значению из сред индекса
            System.out.println(midlElement);
            if (midlElement < searsh) { // ищем справа, вверх
                lowInd = midlInd + 1;
            } else if (midlElement > searsh) {
                hightInd = midlInd - 1; // ищем слева, вниз идем самый последний элемент стает средним

            } else {
                return searsh;
            }
        }
        return -1;
    }
}

// логика [-56, -12, -9, -2, 8, 8, 8, 12, 33, 34, 54, 69, 77, 99] доходим до центрального єлемента -> 8 - 8<34 ->
// да , обрезаем масив с меньшими числами наш массив стал [ 8, 8, 12, 33, 34, 54, 69, 77, 99] - цент элемент == 54,
// 54 < 34 - нет, обрезаем масив с большими числами [ 8, 8, 12, 33, 34]....
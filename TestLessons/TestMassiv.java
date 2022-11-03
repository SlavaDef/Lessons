package TestLessons;


import java.util.Arrays;

public class TestMassiv {




    public static void main(String[] args) {

        int [] a = {8,3,5,6,9};
        int [] b = {55,66};
        System.out.print(Arrays.toString(a) + "\n");
        System.out.print(Arrays.toString(b));

        a[1] = b[0];
        System.out.print(Arrays.toString(a) + "\n");

        char[][] s = {{'1','2','3'}, {'4','5','6'},{'7','8','9'},{'*', '0', '#'}};
        System.out.print(Arrays.deepToString(s)+"\n");// быстрый способ вывода двухмерного массиыва
        System.out.println(s.length); // 4
    }

}
